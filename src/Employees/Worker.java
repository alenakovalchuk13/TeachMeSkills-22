package Employees;

public class Worker implements Position{
    @Override
    public void printPosition() {
        System.out.println("Worker");
    }
}
