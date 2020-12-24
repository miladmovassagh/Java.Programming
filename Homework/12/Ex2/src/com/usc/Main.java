package com.usc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOperations fileOperations = () -> {
            File file = new File("C:\\Folder\\University.txt");
            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("university:tehran;city:tehran;rank:1;\n");
                fileWriter.write("university:sharif;city:tehran;rank:5;\n");
                fileWriter.write("university:ferdowsi;city:mashhad;rank:8;\n");
                fileWriter.write("university:kharazmi;city:karaj;rank:1;\n");
                fileWriter.write("university:tafresh;city:tafresh;rank:20;\n");
                fileWriter.close();
            } catch ( IOException e) {
                e.printStackTrace ();
            }
        };
        fileOperations.write();
    }
}
