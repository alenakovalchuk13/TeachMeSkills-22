package Clinic;

public class Dentist extends Doctor{
    @Override
    void heals(Patient patient) {
        System.out.println("The dentist will prescribe a treatment plan");

    }
}
