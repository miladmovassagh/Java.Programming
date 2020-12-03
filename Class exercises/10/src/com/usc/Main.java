package com.usc;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation();
        Thread thread1 = new Thread()
        {
            @Override
            public void run() {
                fileOperation.readFile();
            }
        };
        Thread thread2 = new Thread()
        {
            @Override
            public void run() {
                fileOperation.writeFile();
            }
        };
        thread1.start();
        thread2.start();
    }
}
