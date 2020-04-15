package app.model;

import app.dao.DAOConnectionUser;
import app.dao.OracleDAOConnectionUser;
import app.entities.User;

import java.util.ArrayList;
import java.util.List;

public class ModelDb {
    private static ModelDb instance = new ModelDb();
    private static DAOConnectionUser daoConnection = OracleDAOConnectionUser.getInstance();
    private List<User> model;

    public static ModelDb getInstance() {
        return instance;
    }

    private ModelDb() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        daoConnection.createUser(user.getName(), user.getPassword(),  100f);
    }

    public List<String> list() {
        // читаем
        List<String> list = new ArrayList<>();
        model = daoConnection.selectAllUsers();

        for (User user : model) {
            String name = user.getName();
            list.add(name);
        }
        return list;
        /*return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());*/
    }
}

