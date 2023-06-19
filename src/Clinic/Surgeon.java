package Clinic;

public class Surgeon extends Doctor{
    @Override
    void heals(Patient patient) {
        System.out.println("The surgeon will prescribe a treatment plan");

    }
}
