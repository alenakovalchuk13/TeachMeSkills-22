package computer;

public class Main {
    public static void main (String[] args){

        Computer computer1 = new Computer(1000,"Honor");
        computer1.getInformation();

        Computer computer2 = new Computer(768, "Honor",
                new RAM("Logitech", 512),
                new Hdd("Seagate", 512, "Local"));
        computer2.getInformation();



    }
}
