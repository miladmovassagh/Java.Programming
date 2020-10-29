package com.usc;

public class CheckUser {
    private static String username;
    private static String userId;
    private static String password;
    private static String age;

    private static CheckUser checkUser = new CheckUser();

    public static CheckUser getInstance() {
        return checkUser;
    }

    private CheckUser() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        CheckUser.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        CheckUser.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        CheckUser.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        CheckUser.age = age;
    }

    public User checkUserInformation() throws ExceptionManager {
        int i;
        for(i = 0; i < username.length(); i++)
            if(!Character.isLetter(username.charAt(i)) && !Character.isSpaceChar(username.charAt(i)))
                throw new ExceptionManager("invalid username");
        for(i = 0; i < password.length(); i++)
            if(Character.isSpaceChar(password.charAt(i)))
                throw new ExceptionManager("invalid password");
        for(i = 0; i < userId.length(); i++)
            if(!Character.isDigit(userId.charAt(i)) && !Character.isSpaceChar(password.charAt(i)))
                throw new ExceptionManager("invalid user id");
        if(password.length() < 8)
            throw new ExceptionManager("invalid password");
        else if(Integer.parseInt(age) <= 0)
            throw new ExceptionManager("invalid age");
        else if(userId.length() > 9)
            throw new ExceptionManager("invalid user id");
        else
            return new User().setUsername(username).setUserId(userId).setPassword(password).setAge(age);
    }
}
