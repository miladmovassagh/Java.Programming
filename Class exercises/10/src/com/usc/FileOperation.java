package com.usc;

import java.io.*;

public class FileOperation {
    private String str = "";

    public FileOperation() {

    }

    public void readFile() {
        File file = new File("file1.txt");
        try {
            FileReader fileReader = new FileReader(file);
            int ascii = fileReader.read();
            while(ascii != -1) {
                str += (char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
        } catch(IOException e) {
            e.printStackTrace ();
        }
    }

    public void writeFile() {
        File file = new File("file2.txt");
        try {
            Thread.sleep(1000);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(str);
            fileWriter.close();
        } catch(InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
