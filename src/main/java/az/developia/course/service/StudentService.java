package az.developia.course.service;

import az.developia.course.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();

    void addStudent(Student student);

}
