import java.util.List;

public interface OperationStorage {
    void writeHistory (Operation operation);

    List<Operation> findAll();

}


