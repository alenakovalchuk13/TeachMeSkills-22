import java.util.ArrayList;
import java.util.List;

public class InMemoryHistory implements History{
    List <String> orations = new ArrayList<>();
    @Override
    public void writeHistory(Operation operation) {
        orations.add(operation.toString());

    }
}
