import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUserStorage implements UserStorage{

    @Override
    public void writeUsers(User user) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Root");

            PreparedStatement preparedStatement = connection.prepareStatement("insert into users (mail, password) values (?, ?)");
            preparedStatement.setString(1, user.getMail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

