package LabWeek8.Task1;

@UserPermission(value = 2)
public class Admin {
    private String username;

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}