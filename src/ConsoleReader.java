import java.util.Scanner;

public class ConsoleReader {
    Scanner scanner = new Scanner(System.in);

    public double readNum() {
        return scanner.nextDouble();
    }

    public String readString() {
        return scanner.next();

    }
}
