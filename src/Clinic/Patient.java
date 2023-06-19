package Clinic;

public class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public Doctor doctor(TreatmentPlan treatmentPlan) {
        int number = treatmentPlan.getNumber();
        if (number == 1) {
            return new Surgeon();
        } else if (number == 2) {
            return new Dentist();
        } else
            return new Therapist();
    }
    public String getName() {
        return name;
    }
}

    

