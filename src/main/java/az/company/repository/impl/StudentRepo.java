package az.company.repository.impl;

import az.company.config.DBConfig;
import az.company.enums.StateEnum;
import az.company.model.Group;
import az.company.model.Student;
import az.company.repository.inter.IStudentRepo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class StudentRepo extends DBConfig implements IStudentRepo {

    @Override
    public void createStudent(Student student) {
        try (Connection connection = connect()) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO  student(name,surname,address,mail,phone_number)");
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {

        }
    }

    @Override
    public List<Student> getAllStudent() {
        return null;
    }

    @Override
    public Student getStudentById(Long id) {
        Student student = new Student();
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Student AS s WHERE s.id = ?")) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setAddress(resultSet.getString("address"));
                student.setMail(resultSet.getString("mail"));
                student.setPhoneNumber(resultSet.getString("phone_number"));
                student.setGroup(new Group(resultSet.getLong("group_id")));
                student.setState(StateEnum.getEnum(resultSet.getInt("state")));
                //student.setCreateDate(resultSet.getTimestamp("create_date").toLocalDateTime());
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return student;
    }

    @Override
    public void deleteStudentById(Long id) {

    }
}
