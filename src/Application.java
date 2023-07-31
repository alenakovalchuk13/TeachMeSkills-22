import java.util.List;

public class Application {
    ConsoleReader consoleReader = new ConsoleReader();
    ConsoleWriter consoleWriter = new ConsoleWriter();

    public void start() {
        while (true) {
            consoleWriter.writeMessage("Enter num1: ");
            double num1 = consoleReader.getNum();
            consoleWriter.writeMessage("Enter num2: ");
            double num2 = consoleReader.getNum();
            consoleWriter.writeMessage("Enter operation (sum, sub, mul, div): ");
            String type = consoleReader.getType();
            Calculator calculator = new Calculator();
            double result = calculator.calculate(num1, num2, type);
            consoleWriter.writeMessage("Result = " + result);

            if (question()) break;
        }
    }

    private boolean question() {
        while (true) {
            consoleWriter.writeMessage("Continue? 1 - yes, 2 - no, 3 - show history");
            double answer = consoleReader.getNum();
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