package az.developia.course.service;

import az.developia.course.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();

    void addStudent(Student student);

    void deleteStudent(Long id);

    Student getStudent(Long id);

    void editStudent(Student student);
}
