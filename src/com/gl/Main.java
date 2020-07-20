package com.gl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Following statement would create an object myPuppy
        Student myPuppy = new Student( "tommy" );
        // demo list object
        List<Student> students = new ArrayList<>();
        students.add(myPuppy);
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
