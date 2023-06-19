package Clinic;

public class Main {
    public static void main (String[] args){
        Patient patient = new Patient("Alena");
        patient.doctor(new TreatmentPlan(1)).heals(patient);

    }
}
