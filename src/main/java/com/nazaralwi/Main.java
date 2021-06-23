package com.nazaralwi;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> hashMap = new MyHashMap<>();

        System.out.println("INPUT DATA:");

        hashMap.put("name", "Rekayasa Perangkat Lunak");
        hashMap.put("url", "https://a-url.com");
        hashMap.put("email", "a-email@gmail.com");
        hashMap.put(null, "a null value");

        System.out.println("Nama \t: " + hashMap.get("name"));
        System.out.println("URL \t: " + hashMap.get("url"));
        System.out.println("Email \t: " + hashMap.get("email"));
        System.out.println("Null \t: " + hashMap.get(null));

        System.out.println("\nHAPUS DATA:");

        hashMap.remove("name");
        hashMap.remove("url");
        hashMap.remove("email");
        hashMap.remove(null);

        System.out.println("Nama \t: " + hashMap.get("name"));
        System.out.println("URL \t: " + hashMap.get("url"));
        System.out.println("Email \t: " + hashMap.get("email"));
        System.out.println("Email \t: " + hashMap.get(null));
    }
}
