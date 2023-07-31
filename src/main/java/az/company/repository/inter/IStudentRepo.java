package az.company.repository.inter;

import az.company.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface IStudentRepo {
    void createStudent(Student student);
    List<Student> getAllStudent();
    Student getStudentById(Long id);
    void deleteStudentById(Long id);

}
