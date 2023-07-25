package az.company.repository.inter;

import az.company.model.Teacher;

import java.util.List;

public interface ITeacherRepo {
    void createTeacher(Teacher teacher);
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long id);
    void deleteTeacherById(Long id);
}
