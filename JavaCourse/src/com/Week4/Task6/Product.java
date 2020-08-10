package com.Week4.Task6;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private HashMap<String, String> map;

    public Product (){
        map = new HashMap<>();
    }
    public Product(HashMap<String,String> map){
        this.map = map;
    }

    public void add(String name, String stock){
        map.put(name, stock);
    }

    public void entrySet(){
        for(Map.Entry<String, String> mp : map.entrySet()){
            System.out.println("Наименование продукта: " + mp.getKey() + ". -> Местоположение объекта: " + mp.getValue());
        }
    }
    public void keySet(){
        for(Map.Entry<String, String> mp : map.entrySet()){
            System.out.println("Наименование продукта: " + mp.getKey());
        }
    }
    public void values(){
        for(Map.Entry<String, String> mp : map.entrySet()){
            System.out.println("Местоположение объекта: " + mp.getValue());
        }
    }
}
