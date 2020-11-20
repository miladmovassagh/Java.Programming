package model.entity;

public class UsersEnti {
    private String name;
    private String username;
    private String password;
    private String email;

    public UsersEnti() {

    }

    public UsersEnti(String name, String username, String password, String email) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public UsersEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UsersEnti setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UsersEnti setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UsersEnti setEmail(String email) {
        this.email = email;
        return this;
    }
}
