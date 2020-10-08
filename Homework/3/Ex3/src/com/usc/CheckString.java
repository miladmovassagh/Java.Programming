package com.usc;

public class CheckString {
    private String str;

    public CheckString() {
        System.out.println("object is created.");
    }

    public CheckString(String str) {
        setString(str);
    }

    public void setString(String str) {
        this.str = str;
    }

    public void checkingString() throws StringException {
        int i , temp = 1;
        for(i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                temp = 0;
                break;
            }
        }
        if(temp == 0) {
            throw new StringException("the entered string contains a number.");
        } else {
            System.out.println("string length is: " + str.length());
        }
    }
}
