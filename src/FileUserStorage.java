import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileUserStorage implements UserStorage{
    private final List<User> users = new ArrayList<>();

    @Override
    public void writeUsers(User user) {
        File file = new File("Users");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(users.toString());
            fileWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}






