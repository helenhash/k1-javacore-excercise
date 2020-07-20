package com.gl;

import java.util.List;

public interface StudentDAO {

    boolean addNewStudent(Student student);
    boolean editStudent(Student student);
    List<Student> getAllStudent();
    boolean deleteStudent(int studentId);
}
