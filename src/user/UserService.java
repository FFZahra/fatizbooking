package user;

public class UserService {

   public static void addUser(User newUser){
        User[] usersCopy = User.getUsers();
        int userCount = usersCopy.length;
        int newLen = userCount + 1;
        User[] temp = new User[newLen];
        temp[userCount] = newUser;

        if (userCount > 0) {
            for (int i = 0; i < usersCopy.length; i++) {
                temp[i] = usersCopy[i];
            }
        }
        User.setUsers(temp);
        User.setIdKount(User.getUsers().length);
       // System.out.println("All Users: " + Arrays.toString(User.getUsers()));
   }
}
