package app.dao;

import app.entities.User;

import java.util.List;

public interface DAOConnectionUser {
    void connect();
    void disconnect();
    List<User> selectAllUsers();
    List<User> selectStartsWith(String name);
    void createUser(String name, String pwd, Float salary);
    void updateUser(int id, float sum);
    void deleteUser(int id);
}
