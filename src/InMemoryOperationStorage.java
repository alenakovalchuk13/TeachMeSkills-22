import java.util.ArrayList;
import java.util.List;

public class InMemoryOperationStorage implements OperationStorage{

    private final List<Operation> operations = new ArrayList<>();

    @Override
    public void writeHistory(Operation operation) {
        operations.add(operation);

    }
    @Override
    public List<Operation> findAll() {
        return new ArrayList<>(operations);
    }
}
