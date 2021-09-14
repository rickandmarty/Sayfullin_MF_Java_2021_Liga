package ru.philosophyit.internship.javabase.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String ...args) {
        Calendar calendar = new GregorianCalendar();
        // Устанавливаем текущий год и месяц в календарь.
        calendar.set(Calendar.getInstance().get(Calendar.YEAR),Calendar.getInstance().get(Calendar.MONTH),1);
        // Определяем количество дней в месяце.
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        // Определяем какой день недели приходился на 1 число текущего месяца.
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int emptyDays = 0;
        if (dayOfWeek == 0)
            emptyDays = 6;
        else
            emptyDays = dayOfWeek - 1;
        // Определяем длину формируемого массива (7 - для указания названий дней недели).
        int lengthOfArray = 7 + emptyDays + daysInMonth;
        // Создаем массив для вывода в консоль.
        String[] arrayToPrint = new String[lengthOfArray];
        arrayToPrint[0] = "ПН";
        arrayToPrint[1] = "ВТ";
        arrayToPrint[2] = "СР";
        arrayToPrint[3] = "ЧТ";
        arrayToPrint[4] = "ПТ";
        arrayToPrint[5] = "СБ";
        arrayToPrint[6] = "ВС";
        // Добавляем пустые строки если неделя начинается не с 1 числа.
        for (int i = 0; i < emptyDays; i++) {
            arrayToPrint[7 + i] = " ";
        }
        // Заполняем массив для вывода.
        for (int i = 0;i < arrayToPrint.length - 7 - emptyDays;i++){
            arrayToPrint[7 + emptyDays + i] = Integer.toString(i+1);
        }
        for (int i = 0; i < arrayToPrint.length; i++) {
            String result = "";
            int count = 1;
            while (count % 8 != 0) {
                result = result + (arrayToPrint[i] + "\t");
                count++;
                if (arrayToPrint[i].equals(Integer.toString(daysInMonth)))
                    break;
                if (count % 8 != 0 & i < arrayToPrint.length - 1) {
                    i++;
                }
            }
            System.out.println(result);
        }
    }
}

