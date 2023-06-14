package Phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void infoPhone(){
        System.out.println("Number: " + number + "model: " + model + "weight: " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Colling " + name + " from number " + number);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("Message to a number " + number);
        }
    }
}





