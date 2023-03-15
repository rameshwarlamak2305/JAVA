package collection;

import java.util.ArrayList;
import java.util.Iterator;

class User {
    String username;
    int age;
    String address;

    public User(String username, int age, String address) {
        this.username = username;
        this.age = age;
        this.address = address;
    }
}

public class MainUser {
    public static void main(String[] args) {
        // Create some objects and add inside arrayList
        ArrayList<User> usersList = new ArrayList<>();
        usersList.add(new User("Ram", 21, "shegaon"));
        usersList.add(new User("Shyam",22,"Mumbai"));
        		
        		 
        usersList.add(new User("Karan", 25, "Pune"));
        		
        // Traverse all Objects with the help of Iterator Interface
        Iterator<User> iter = usersList.iterator();
        while (iter.hasNext()) {
            User user = iter.next();
            System.out.println("Username: " + user.username + ", Age: " + user.age + ", Address: " + user.address);
        }

        // Remove position 2 Object from ArrayList
        usersList.remove(1); // index starts from 0

        // Perform a searching operation with username
        String searchUsername = "Ram";
        for (User user : usersList) {
            if (user.username.equals(searchUsername)) {
                System.out
                        .println("Found user: " + user.username + ", Age: " + user.age + ", Address: " + user.address);
                break;
            }
        }

        // Add another List of Objects inside ArrayList
        ArrayList<User> anotherUsersList = new ArrayList<>();
        anotherUsersList.add(new User("Chetan", 27, "Dadar"));
        anotherUsersList.add(new User("Deepak", 26, "Hydrabad"));
        usersList.addAll(anotherUsersList);

        // Traverse all Objects again
        iter = usersList.iterator();
        while (iter.hasNext()) {
            User user = iter.next();
            System.out.println("Username: " + user.username + ", Age: " + user.age + ", Address: " + user.address);
        }
    }
}