import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Application application = new Application();
        try {
            application.start();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}