package app.dao;

import app.entities.Student;
import java.util.List;

public interface DAOConnection {
    void connect();
    void disconnect();
    List<Student> selectAllStudents();
    List<Student> selectStartsWith(String name);
    void createStudent(String name, float scholarShip);
    void updateStudent(int id, float sum);
    void deleteStudent(int id);
}
