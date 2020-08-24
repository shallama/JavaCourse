package com.Week6;

//import com.sun.tools.javac.util.StringUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task3 {

    public static void findUserPhone(String name, String locate)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(locate))) {
            String list;
            while ((list = reader.readLine()) != null) {
                if (list.indexOf(name) == name.indexOf(name)) {
                    System.out.print("Фамилия: " + name + " -> ");
                    System.out.println(list.substring(list.indexOf("номер")));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void findNumInst(int year, String locate){

        try (BufferedReader reader = new BufferedReader(new FileReader(locate))) {
           String list;
           int k;
           int count = 0;
           while ((list = reader.readLine()) != null){
               k = Integer.parseInt((list.substring(list.indexOf("20"), list.indexOf("20") + 4)));
               if (k >= year){
                   count++;
               }
           }
           System.out.println("Количество установленных телефонов с " + year + " года " + "-> " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
