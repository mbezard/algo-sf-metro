package isep.fr.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static String dataPath = "./data";

    public static List<Route> routes = new ArrayList<>();

    public static void initRoutes() throws FileNotFoundException {
        File inputF = new File(dataPath + "/routes.txt");
        InputStream inputFS = new FileInputStream(inputF);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));

        routes = br.lines().skip(1).map(s -> new Route(Integer.parseInt(s.split(",")[0]))).collect(Collectors.toList());
    }

    public static void main(String[] args) throws FileNotFoundException {
        initRoutes();
        System.out.println(routes.size());
        System.out.println(routes.get(0));
    }
}
