package com.gl;

public class Student extends Person {
    private String className;

    public Student(String name) {
        this.name = name;
        System.out.println("Passed Name is :" + name );
    }

    public static void main(String []args) {
        // Following statement would create an object myPuppy
        Student myPuppy = new Student( "tommy" );
    }

    @Override
    protected void doActivity() {
        System.out.println("Override from Student");
        super.doActivity();
    }
}
