package model;

public class Login {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public Login setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Login setPassword(String password) {
        this.password = password;
        return this;
    }
}
