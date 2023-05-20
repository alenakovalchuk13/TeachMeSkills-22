import java.util.Scanner;



public class Homework3 {
    public static void main(String[] args) {
        getInformation();
        getChar();
        getIndex();


    }

    //Task 1
    public static void getInformation() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please,enter Name:");
        String name = scanner.nextLine();
        System.out.println("Name:_" + name);

        System.out.print("Please,enter Surname:");
        String surname = scanner.nextLine();
        System.out.println("Surname:_" + surname);

        System.out.print("Please,enter Age:");
        int age = scanner.nextInt();
        System.out.println("Age:_" + age);

        System.out.print("Please,enter Height:");
        int height = scanner.nextInt();
        System.out.println("Height:_" + height);

        System.out.print("Please,enter Weight:");
        double weight = scanner.nextDouble();
        System.out.println("Weight:_" + weight);


    }
    // Task 2
    public static void getChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter symbol:");
        char symbol = scanner.next().charAt(0);
        System.out.println(symbol + "-" + (int) symbol);

    }

    // Task 3
    public static void getIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please,enter your height:");
        double height = scanner.nextDouble();
        System.out.print("Please,enter Weight:");
        double weight = scanner.nextDouble();

        System.out.println("Your Body Mass Index = " + (weight / (height * height * 0.0001)) + "kg/m2");

    }
}