package org.example;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);

        list.add(2,50);

        for (int x: list){
            System.out.println(x);
        }
        System.out.println(list);





//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        for (int i = 0;i< list.size();i++){
//            System.out.println(list.get(i));
//        }
//        list.remove(2);
//
//
//        for(int x: list){
//            System.out.println(x);
//        }
//        System.out.println(list.contains(5));
//        System.out.println(list.contains(50));


    }
}


