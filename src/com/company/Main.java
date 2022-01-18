package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "mass.txt";
        File file = new File(path);

        if(file.exists())
        {
            System.out.println("File exists");
        }
        else
        {
            System.out.println("File SOZDAN!");
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int search = 0;
        String i;
        int b = 0;
        while ((i = bufferedReader.readLine()) !=null)
        {
            if(i.length() == 5){
                b++;
            }

        }


        System.out.println(b);
    }
}
