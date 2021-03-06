package isep.fr.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Route {
    private Integer id;
    private List<Edge> edges = new ArrayList<>();

    public Route(Integer id) {
        this.id = id;
    }

}
