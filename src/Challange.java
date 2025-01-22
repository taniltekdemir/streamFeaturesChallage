import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Challange {

    public List<Integer> solution1() {

//        Find two numbers in an array if their sum equals a given target value. If no such pair exists, return an empty list.
        int[] nums = {2, 7, 11, 15};
        int target = 18;

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                result.add(complement);
                result.add(nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public List<String> solution2() {

        /**You want to filter the information of students in a student list:

        Each student has a name, age, and grade.
                Find students with grades above 50 and return a list of their names.
        */
        List<Student> students = new ArrayList<>();
        students.add(new Student("ali",95.5,15));
        students.add(new Student("Ayşe",45.5,19));
        students.add(new Student("Mehmet",25.0,17));


        return students.stream().filter(x -> x.getGpa() >45.0)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public Map<Integer,Double> solution3() {
/**        Group students in a roster by age. Calculate the total grades of students in each age group. The result should be a Map like this: */
        List<Student> students = new ArrayList<>();
        students.add(new Student("ali",95.5,15));
        students.add(new Student("Ayşe",45.5,19));
        students.add(new Student("Mehmet",25.0,17));
        students.add(new Student("Can",75.0,17));
        students.add(new Student("Furkan",45.0,19));
        students.add(new Student("Anıl",78.0,15));

        return students.stream()
                .collect(Collectors.groupingBy(Student::getAge, Collectors.summingDouble(Student::getGpa)));
    }

    public Student solution4() {
        /**I want you to find the student with the highest grade in a list of students.
         Find the student with the highest grade by printing the students' names and grades.
         */
        List<Student> students = new ArrayList<>();
        students.add(new Student("ali",95.5,15));
        students.add(new Student("Ayşe",45.5,19));
        students.add(new Student("Mehmet",25.0,17));
        students.add(new Student("Can",75.0,17));
        students.add(new Student("Furkan",45.0,19));
        students.add(new Student("Anıl",78.0,15));

        return students.stream()
                .max(Comparator.comparingDouble(Student::getGpa))
                .orElse(null);
    }

    public Map<Integer,Double> solution5() {
/**
 * You need to perform the following operations from a list of students:
 *
 * Group students by age.
 * Calculate the average grades of students in each age group.
 * Return the average grades as a Map<Integer, Double> (age = key, average grade = value).
 */
        List<Student> students = new ArrayList<>();
        students.add(new Student("ali",95.5,15));
        students.add(new Student("Ayşe",45.5,19));
        students.add(new Student("Mehmet",25.0,17));
        students.add(new Student("Can",75.0,17));
        students.add(new Student("Can",60.0,16));
        students.add(new Student("Furkan",45.0,19));
        students.add(new Student("Anıl",78.0,15));

        return students.stream()
                .collect(Collectors.groupingBy(Student::getAge,Collectors.averagingDouble(Student::getGpa)));
    }
    public List<Student> solution6() {
/**
 You need to do the following from a list of students:

 Sort students by grades in descending order.
 Print the names and grades of the first 3 students.
 If the number of students is less than 3, print the names and grades of the current students.
 */
        List<Student> students = new ArrayList<>();
        students.add(new Student("ali",95.5,15));
        students.add(new Student("Ayşe",45.5,19));
        students.add(new Student("Mehmet",25.0,17));
        students.add(new Student("Can",75.0,17));
        students.add(new Student("Can",60.0,16));
        students.add(new Student("Furkan",45.0,19));
        students.add(new Student("Anıl",78.0,15));

        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                .limit(3)
                .toList();
    }

    public void solution7() {
/**
 Filter students who start with a letter (for example, "A").

 Calculate the average of these students' grades.

 If there is no such student, print the message "No such student".
 */
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali",95.5,15));
        students.add(new Student("Ayşe",45.5,19));
        students.add(new Student("Mehmet",25.0,17));
        students.add(new Student("Can",75.0,17));
        students.add(new Student("Can",60.0,16));
        students.add(new Student("Furkan",45.0,19));
        students.add(new Student("Anıl",78.0,15));

        var avarage = students.stream()
                .filter(s-> s.getName().startsWith("A"))
                .mapToDouble(Student::getGpa)
                .average();

        if(!avarage.isPresent()) {
            System.out.println("not found");
        }else{
            System.out.println(avarage.getAsDouble());
        }



    }

}
