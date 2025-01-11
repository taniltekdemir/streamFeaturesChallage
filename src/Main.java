import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Tom"));
        users.add(new User(2,"Jay"));
        users.add(new User(3,"Sebastiaan"));
        users.add(new User(4,"Frans"));
        users.add(new User(5,"Cyril"));

         // foreach function
          users.stream().forEach(user -> System.out.println(user.toString()));

          //  with {} you can generate many operation wiht same object
          users.stream().forEach(user -> {
              System.out.println(user.id);
              System.out.println(user);
          });

          // Method Reference
          users.stream().forEach(User::talk);
          // filter function
          var filteredList = users.stream().filter(user -> user.name.startsWith("T")).toList();
          filteredList.forEach(User::talk);

          // Map function can create new object on list
          users.stream().map(user -> new User(user.id, user.name+ "_new")).toList().forEach(User::talk);

          Map<Integer,String> userMap = users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));

          //foreach can get 2 parameters
          userMap.forEach((key,value) -> System.out.println(key + " : " + value));

    }


}

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id =" + this.id + ", name=" + this.name +"]";
    }

    public void talk() {
        System.out.println("User name=" + this.name);
    }
}