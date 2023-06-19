package Clinic;

public class Therapist extends Doctor{
    @Override
    void heals(Patient patient) {
        System.out.println("The therapist will prescribe a treatment plan");

    }
}
