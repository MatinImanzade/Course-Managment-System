package az.company.controller;

import az.company.model.Student;
import az.company.repository.inter.IStudentRepo;
import lombok.AllArgsConstructor;


import java.util.List;

@AllArgsConstructor
public class StudentController {
    private final IStudentRepo studentRepo;

    public void createStudent(Student student) {
        studentRepo.createStudent(student);
    }

    public Student getStudnetById(Long id) {
        return studentRepo.getStudentById(id);
    }

    public List<Student> getAllStudent() {
        return studentRepo.getAllStudent();
    }

    public void deleteStudentById(Long id) {
        studentRepo.deleteStudentById(id);
    }
}
