package az.developia.course.service;

import az.developia.course.dto.Student;
import az.developia.course.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        Iterable<Student> all = studentRepository.findAll();
        List<Student> students = new ArrayList<>();
        all.forEach(students::add);
        return students;
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
