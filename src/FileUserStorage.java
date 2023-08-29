import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileUserStorage {

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    ArrayList<User> users = new ArrayList<>();

    public void findAllUsers (){
        File file = new File("Users");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(users.toString());
            fileWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


    }



