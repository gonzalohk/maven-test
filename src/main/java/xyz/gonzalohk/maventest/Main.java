package xyz.gonzalohk.maventest;

import java.util.Properties;

import static spark.Spark.*;
import static spark.Spark.port;

public class Main {

    public static String TEST_PATH = "test";
    public static String ENTORNOS_PATH = "entornos";

    public void mappingRoutes(Properties properties) {
        get(TEST_PATH, (req, res) -> properties.getProperty("TEST_MESSAGE"));
        get(ENTORNOS_PATH, (req, res) -> String.format(properties.getProperty("ENTORNO_MESSAGE"),
                properties.getProperty("ENTORNO_LABEL")));
    }

    public void startServer(Properties properties) {
        port(Integer.parseInt(properties.getProperty("PORT")));
        mappingRoutes(properties);
    }

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(Main.class.getClassLoader().getResourceAsStream("vars.properties"));
        Main main =new Main();
        main.startServer(properties);
    }
}
