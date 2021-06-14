package isep.fr.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString()
public class Edge {

    private Integer id;
    private Double longitude;
    private Double latitude;

    public Edge(Integer id) {
        this.id = id;
    }
}
