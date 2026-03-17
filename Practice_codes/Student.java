package com;

public class Student {

    static String institute = "ABC";

    String name = "Ravi";

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Aman";
        s1.institute = "XYZ";

        System.out.println(s2.name + " " + s2.institute);
    }
}

