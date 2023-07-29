import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ConsoleReader consoleReader = new ConsoleReader();
        ConsoleWriter consoleWriter = new ConsoleWriter();

        consoleWriter.writeMessage("Enter num1");
        double num1 = consoleReader.getNum();

       consoleWriter.writeMessage("Enter num2");
        double num2 = consoleReader.getNum();

        consoleWriter.writeMessage("Enter operation");
        String type = consoleReader.getType();

        Calculator calculator = new Calculator();

        double result = calculator.calculate(num1, num2, type);
        consoleWriter.writeMessage("Result= " + result);


    }
}


