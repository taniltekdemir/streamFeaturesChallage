import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<User> users = new ArrayList<>();
//        users.add(new User(1,"Tom"));
//        users.add(new User(2,"Jay"));
//        users.add(new User(3,"Sebastiaan"));
//        users.add(new User(4,"Frans"));
//        users.add(new User(5,"Cyril"));
//
//         // foreach function
//          users.stream().forEach(user -> System.out.println(user.toString()));
//
//          //  with {} you can generate many operation wiht same object
//          users.stream().forEach(user -> {
//              System.out.println(user.id);
//              System.out.println(user);
//          });
//
//          // Method Reference
//          users.stream().forEach(User::talk);
//          // filter function
//          var filteredList = users.stream().filter(user -> user.name.startsWith("T")).toList();
//          filteredList.forEach(User::talk);
//
//          // Map function can create new object on list
//          users.stream().map(user -> new User(user.id, user.name+ "_new")).toList().forEach(User::talk);
//
//          Map<Integer,String> userMap = users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
//
//          //foreach can get 2 parameters
//          userMap.forEach((key,value) -> System.out.println(key + " : " + value));
//
//          // joining
//          var joinedUserName = users.stream().map(user -> user.name).collect(Collectors.joining(", "));
//          System.out.println(joinedUserName);
//
//          //Stream.concat
//          List<String> list1 = Arrays.asList("apple", "banana", "orange");
//          List<String> list2 = Arrays.asList("grape", "melon", "pineapple");
//
//          Stream<String> stream1 = list1.stream();
//          Stream<String> stream2 = list2.stream();
//
//          Stream<String> concatenatedStream = Stream.concat(stream1,stream2);
//          concatenatedStream.forEach(System.out::println);
//
//
//          // FlatMap()
//          //Question:  Given a List of integers, return a List which contains numbers and negative of those numbers in same order.
//          // For example, input list is [1, 2, 3, 4, 5, 6] then you should return a list containing [1, -1, 2, -2, 3, -3, 4, -4, 5, -5, 6, -6]
//
//          List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//          List<Integer> numbersAndNegatives = numbers.stream()
//                                                     .flatMap(x -> Stream.of(x,-x))
//                                                     .toList();
//
//          numbersAndNegatives.forEach(item -> System.out.println(item.toString()));
//
//
//          //Or flatmap()
//
//        List<Integer> odds = Arrays.asList(1,5,9);
//        List<Integer> evens = Arrays.asList(2,4,8);
//        List<Integer> primes = Arrays.asList(2,7,11);
//
//        var totalList = Stream.of(odds,evens,primes)
//                .flatMap(Collection::stream)
//                .toList();
//        System.out.println(totalList);
//
//        //takeWhile using
//        Stream<Integer> stream
//                = Stream.of(4, 4, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> list
//                = stream.takeWhile(number -> (number / 4 == 1))
//                .collect(Collectors.toList());
//
//        System.out.println(list);
//
////        convert to Array to Stream
//
//        String[] arrayString = {"Java","Python","C#"};
//
//        Stream arrayToStream = Stream.of(arrayString);
//
//        arrayToStream.forEach(System.out::println);

    Challange challange = new Challange();
//        System.out.println(challange.solution1());
//        System.out.println(challange.solution2());
//        System.out.println(challange.solution3());
//        System.out.println(challange.solution4());
//        System.out.println(challange.solution5());
//        System.out.println(challange.solution6());
        challange.solution7();

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