import java.util.Scanner;

public class ConsoleReader {
    Scanner scanner = new Scanner(System.in);

    public double getNum() {
        return scanner.nextDouble();
    }

    public String getType() {
        return scanner.next();

    }
}
