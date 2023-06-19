package Employees;

public class Main {
    public static void main (String[] args){
        Director director = new Director();
        Accountant accountant = new Accountant();
        Worker worker = new Worker();

        director.printPosition();
        accountant.printPosition();
        worker.printPosition();

    }
}
