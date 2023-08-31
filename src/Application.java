
import java.sql.SQLException;
import java.util.List;

public class Application {

    ConsoleReader consoleReader = new ConsoleReader();
    ConsoleWriter consoleWriter = new ConsoleWriter();

    UserService userService = new UserService();



    public void start() throws SQLException {
        boolean check = true;
        int action;

        while (check) {

            consoleWriter.writeMessage("Enter your action: 1 - pass authorization, 2 - register");
            action = (int) consoleReader.readNum();
            switch (action) {
                case 1:
                    User user = userService.checkData();
                    if (user == null) {
                        consoleWriter.writeMessage("There is no such user. Try one more time.");
                    } else {
                        enterData();
                        check = false;
                    }
                    break;
                case 2:
                    userService.register();
                    enterData();
                    break;
            }
        }
    }


    public void enterData() throws SQLException {
        while (true) {
            consoleWriter.writeMessage("Enter num1: ");
            double num1 = consoleReader.readNum();
            consoleWriter.writeMessage("Enter num2: ");
            double num2 = consoleReader.readNum();
            consoleWriter.writeMessage("Enter operation (sum, sub, mul, div): ");
            String type = consoleReader.readString();
            Calculator calculator = new Calculator();
            double result = calculator.calculate(num1, num2, type);
            consoleWriter.writeMessage("Result = " + result);

            if (question()) break;
        }
    }

    private boolean question() {
        while (true) {
            consoleWriter.writeMessage("Continue? 1 - yes, 2 - no, 3 - show history");
            double answer = consoleReader.readNum();
            if (answer == 1) return false;
            if (answer == 2) return true;
            if (answer == 3) {
                List<String> history = Calculator.getHistory();
                for (String op : history) {
                    consoleWriter.writeMessage(op);

                }
            }
        }
    }
}


