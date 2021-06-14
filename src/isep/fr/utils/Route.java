package isep.fr.utils;

public class Route {
    private Integer id;

    public Route(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                '}';
    }
}
