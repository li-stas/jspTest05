package app.model;

import app.dao.DAOConnection;
import app.dao.OracleDAOConnection;
import app.entities.User;

import java.util.ArrayList;
import java.util.List;

public class ModelDb {
    private static ModelDb instance = new ModelDb();
    private static DAOConnection daoConnection = OracleDAOConnection.getInstance();
    private List<User> model;

    public static ModelDb getInstance() {
        return instance;
    }

    private ModelDb() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        daoConnection.createUser(user.getName(), user.getMax_total_points());
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

