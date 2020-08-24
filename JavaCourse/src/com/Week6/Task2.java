package com.Week6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task2 {
    public void make(String str) throws IOException {
        Path path = Paths.get(str);
        try {
            Path f = path.getParent();
            List<String> list = Files.readAllLines(path);
            System.out.println();
            list.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.toString().compareTo(o2.toString());
                }
            });
            Path file2 = Files.createFile(Paths.get(f + "file2.txt"));
            Files.write(file2, list);
        } catch (IOException io){
            throw new NoSuchFileException(path.toString());
        }


    }
}
