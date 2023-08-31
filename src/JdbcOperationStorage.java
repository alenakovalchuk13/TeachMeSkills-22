import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcOperationStorage implements OperationStorage {
    private final List<Operation> operations = new ArrayList<>();


    @Override
    public void writeHistory(Operation operation)  {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "Root");

            PreparedStatement preparedStatement = connection.prepareStatement("insert into operations (num1, num2, type, result) values  (?,?,?,?)");
            preparedStatement.setDouble(1, operation.getNum1());
            preparedStatement.setDouble(2, operation.getNum2());
            preparedStatement.setString(3, operation.getType());
            preparedStatement.setDouble(4, operation.getResult());

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Operation> findAll() {

       return new ArrayList<>();
    }
}

