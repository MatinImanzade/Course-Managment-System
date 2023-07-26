package az.company.repository.impl;

import az.company.config.DBConfig;
import az.company.model.Student;
import az.company.repository.inter.IStudentRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class StudentRepo extends DBConfig implements IStudentRepo{

    @Override
    public void createStudent(Student student) {
        try(Connection connection = connect()){
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO  student(name,surname,address,mail,phone_number)");
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {

        }
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public void deleteStudentById(Long id) {

    }
}
