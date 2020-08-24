package com.Week6;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    int k;

    public void read(String str){
        Path paths = Paths.get(str);
        ArrayList<String> ar = new ArrayList<>();
        try (Scanner scanner = new Scanner(paths)){
            while (scanner.hasNext()) {
                k = scanner.nextInt();
                if (k % 2 == 0) {
                    ar.add(String.valueOf(k));
                }
            }
            FileWriter writer =  new FileWriter(str);
            writer.write(String.valueOf(ar).replace("[", "").replace("]", ""));
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
