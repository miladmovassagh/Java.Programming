package com.usc;

public class Users {
    private int n;
    private String[] name;
    private String[] family;
    private int[] age;

    public Users() {
        System.out.println("object is created.");
    }

    public Users(int n) {
        setN(n);
    }

    public void setN(int n) {
        this.n = n;
        name = new String[n];
        family = new String[n];
        age = new int[n];
    }

    public void setUsers(int i, String name, String family, int age) {
        this.name[i] = name;
        this.family[i] = family;
        this.age[i] = age;
    }

    public void checkUsers(int n) throws UsersException {
        int i, j, temp = 1;
        for(i = n-1, j = i; i > 0; i--) {
            if (name[j].equals(name[i - 1]) && family[j].equals(family[i - 1]) && age[j] == age[i - 1]) {
                temp = 0;
                break;
            }
        }
        if(temp == 0)
            throw new UsersException("Duplicate user!!");
        else if(n == this.n)
            System.out.println("Users information was successfully registered.");
    }
}
