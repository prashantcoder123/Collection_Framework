package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
       // Set<Integer> set = new HashSet<>();
       // Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();
//        set.add(32);
//        set.add(2);
//        set.add(54);
//        set.add(21);
//        set.add(65);
//       // set.add(54);
//        System.out.println(set);
//
//        set.remove(54);
//        System.out.println(set);
//        System.out.println(set.contains(21));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
//        set.clear();
//        System.out.println(set);


        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("anuj",2));
        studentSet.add(new Student("ramesh",3));
        studentSet.add(new Student("shivam",4));
        studentSet.add(new Student("rohit",2));

Student s1 = new Student("anuj",2);
        Student s2 = new Student("rohit",2);
        System.out.println(s1.equals(s2));

        System.out.println(studentSet);

    }
}
