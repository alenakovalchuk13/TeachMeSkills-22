import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperationStorage implements OperationStorage {

    private final List<Operation> operations = new ArrayList<>();

    @Override
    public void writeHistory(Operation operation) {
        File file = new File("History");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(operation.toString());
            fileWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    @Override
    public List<Operation> findAll() {
        return new ArrayList<>(operations);


    }
}

