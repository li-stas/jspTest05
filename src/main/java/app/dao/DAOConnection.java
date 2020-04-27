package app.dao;

import app.entities.User;
import app.entities.Questions;

import java.util.List;

public interface DAOConnection {
    void connect();
    void disconnect();
    List<Questions> selectAllQuestion();
    List<User> selectAllUsers();
    List<User> selectStartsWith(String name);
    void createUser(String name, String pwd, Float salary);
    void updateUser(int id, float sum);
    void deleteUser(int id);

    void createUser(String name, int max_total_points);
}
