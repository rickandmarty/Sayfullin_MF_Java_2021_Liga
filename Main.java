package ru.philosophyit.internship.javabase.files;

import java.io.File;

public class Main
{
    static String tab = "\t";
    static int num = 0;

    public static void main(String[] args)
    {
        String dirLocation = "C:/Users/msayfullin/Desktop/javabase/src/main/java/ru/philosophyit/internship/javabase";
        File dir = new File(dirLocation);
        uncoverDirectory(dir);
    }

    static void uncoverDirectory(File dir){
        for(File file : dir.listFiles()) {
            printFolderFilenames(file,num);
            if(file.isDirectory()) {
                num++;
                uncoverDirectory(file);
            }
        }
        num--;
    }

    static void printFolderFilenames(File file, int numberOfTabs){
        System.out.println(tab.repeat(numberOfTabs) + file.getName());
    }
}