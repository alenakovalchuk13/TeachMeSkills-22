import java.util.ArrayList;

public class UserService {
    ConsoleReader consoleReader = new ConsoleReader();
    ConsoleWriter consoleWriter = new ConsoleWriter();
    ValidMail validMail = new ValidMail();
    ValidPassword validPassword = new ValidPassword();
    private final UserStorage userStorage = new JdbcUserStorage();

    ArrayList<User> users = new ArrayList<>();


    public void register() {

        consoleWriter.writeMessage("Enter mail: ");
        String mail = consoleReader.readString();
        while (validMail.valid(mail)) {
            consoleWriter.writeMessage("The email was entered incorrectly, please try again ");
            mail = consoleReader.readString();
        }

        consoleWriter.writeMessage("Enter password: ");
        String password = consoleReader.readString();
        while (validPassword.valid(mail)) {
            consoleWriter.writeMessage("The password was entered incorrectly, please try again ");
            password = consoleReader.readString();
        }
        User user = new User(mail, password);
        userStorage.writeUsers(user);

    }


    public User checkData() {
        consoleWriter.writeMessage("Enter mail: ");
        String mail = consoleReader.readString();
        while (validMail.valid(mail)) {
            consoleWriter.writeMessage("The email was entered incorrectly, please try again ");
            mail = consoleReader.readString();
        }

        consoleWriter.writeMessage("Enter password: ");
        String password = consoleReader.readString();
        while (validPassword.valid(mail)) {
            consoleWriter.writeMessage("The password was entered incorrectly, please try again ");
            password = consoleReader.readString();
        }
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getMail().equals(mail) && users.get(i).getPassword().equals(password)) {
                return users.get(i);
            }
        }
        return null;
    }

}

