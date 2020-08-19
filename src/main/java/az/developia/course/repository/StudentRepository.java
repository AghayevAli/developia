package az.developia.course.repository;

import az.developia.course.dto.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
