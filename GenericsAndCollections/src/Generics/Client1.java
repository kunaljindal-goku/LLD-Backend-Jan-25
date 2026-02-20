package Generics;

import javax.lang.model.type.IntersectionType;
import java.util.ArrayList;
import java.util.List;

public class Client1 {

    public static void main(String[] args) {
        ScalerUser su = new ScalerUser("Kunal");

        Student s = new Student("Manvendra");

        UserUtility userUtility = new UserUtility();
        userUtility.printName(su);
        userUtility.printName(s);

        List<ScalerUser> users = new ArrayList<>();
        userUtility.printNames(users);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Kunal"));
        students.add(new Student("Manvendra"));
        userUtility.printNames(students);

        List<Integer> l = new ArrayList<>();

    }
}
