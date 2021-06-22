package com.nazaralwi;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> hashMap = new MyHashMap<>();
        hashMap.put("name", "Rekayasa Perangkat Lunak");
        hashMap.put("url", "https://a-url.com");
        hashMap.put("email", "a-email@gmail.com");

        System.out.println("Nama \t: " + hashMap.get("name"));
        System.out.println("URL \t: " + hashMap.get("url"));
        System.out.println("Email \t: " + hashMap.get("email"));
    }
}
