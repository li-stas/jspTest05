package app.entities;

public class User {
    private Integer id;
    private String name;
    private int max_total_points;

    public User() {

    }

    public User(Integer id, String name, int max_total_points) {
        this.id = id;
        this.name = name;
        this.max_total_points = max_total_points;
    }

    public User(String name, int max_total_points) {
        this.name = name;
        this.max_total_points = max_total_points;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax_total_points() {
        return max_total_points;
    }

    public void setMax_total_points(int max_total_points) {
        this.max_total_points = max_total_points;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", max_total_points=" + max_total_points +
                '}';
    }
}