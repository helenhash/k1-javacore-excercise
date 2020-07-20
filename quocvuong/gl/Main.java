package com.gl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Following statement would create an object myPuppy
        Student myPuppy = new Student( "tommy" );
        Student myPuppy2 = new Student( "tommy2" );
        Student myPuppy3 = new Student( "tommy3" );
        Student myPuppy4 = new Student( "tommy4" );
        Student myPuppy5 = new Student( "tommy5" );
        // demo list object
        List<Student> students = new ArrayList<>();
        students.add(myPuppy);
        students.add(myPuppy2);
        students.add(myPuppy3);
        students.add(myPuppy4);
        students.add(myPuppy5);
        for (Student student : students){
            System.out.println(student.name);
        }
        // demo map
        Map<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");

        //demo set
    }

}
