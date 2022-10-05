package org.example;

import java.util.ArrayList;

public class Insertion_sort {
    static void insertion_sort(ArrayList str) {
        for (int i = 1; i < str.size(); i++) {
            String current = (String) str.get(i);
            int j = i - 1;
            while (j >= 0 && current.compareTo((String) str.get(j)) < 0) {
                str.set(j + 1, str.get(j));
                j--;
            }
            str.set(j + 1, current);
        }
    }


    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ashish");
        al.add("Ashutosh");
        al.add("Anand");
        al.add("Anmol");
        al.add("Shivam");
        al.add("Satyam");
        al.add("Vikash");
        al.add("Book");
        System.out.println("Before sorting");
        System.out.println(al);
        insertion_sort(al);
        System.out.println("after sorting");
        System.out.println(al);
    }
}
