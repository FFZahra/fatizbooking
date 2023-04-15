package user;

import java.util.Objects;

public class User {
   private static User[] users = {};
    private static int idKount = 0;
    private int userID;
    private String name;

//    static {
//        idKount++;
//        int newval = idKount;
//        setIdKount(newval);
//    }

    public User() {
    }

    public User(String name) {
        int temp = User.getIdKount();
        this.userID = temp + 1;
        setIdKount(this.userID);
        this.name = name;
    }

    public static User[] getUsers() {
        return users;
    }

    public static void setUsers(User[] users) {
        User.users = users;
    }

    public static int getIdKount() {
        return idKount;
    }

    public static void setIdKount(int idKount) {
        User.idKount = idKount;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + userID + "  " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userID == user.userID && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, name);
    }
}
