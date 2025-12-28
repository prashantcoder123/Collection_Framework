package org.example;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> List = new ArrayList<>();
List.add(1);
List.add(5);
List.add(80);
        System.out.println(List.get(2));
        System.out.println(List.size());
        for (int i = 0;i< List.size();i++){
            System.out.println(List.get(i));
        }
    }
}


