import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHistory implements History{
    public void writeHistory (Operation operation)  {
        File file = new File("History");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(operation.toString());
            fileWriter.write(10);
            fileWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
