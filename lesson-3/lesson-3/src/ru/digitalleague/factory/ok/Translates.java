package ru.digitalleague.factory.ok;

import java.util.HashMap;

public class Translates {
    HashMap<String, String> hashMap = new HashMap<String, String>();

    public void fill() {
        hashMap.put("ru", "Доброго дня!");
        hashMap.put("en", "Have a nice day!");
        hashMap.put("de", "Einen schönen Tag noch!");
        hashMap.put("fr", "Bonne journée!");
        hashMap.put("kk", "Бүгінгі күніңіз жақсы өтсін!");
    }

    public String getValue(String key){
        return hashMap.get(key);
    }
}
