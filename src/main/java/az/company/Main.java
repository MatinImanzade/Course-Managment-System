package az.company;

import az.company.controller.StudentController;
import az.company.repository.impl.StudentRepo;
import az.company.repository.inter.IStudentRepo;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController(new StudentRepo());
        System.out.println(studentController.getStudnetById(1L));
    }
}
