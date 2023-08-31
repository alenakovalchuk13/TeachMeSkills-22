import java.sql.SQLException;
import java.util.List;

public interface OperationStorage {
    void writeHistory (Operation operation) throws SQLException;

    List<Operation> findAll();

}
