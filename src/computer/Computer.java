package computer;

public class Computer {
    private double price;
    private String model;
    private RAM ram;
    private Hdd hdd;

    public Computer(double price, String model){
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new Hdd();

    }

    public Computer(double price, String model, RAM ram, Hdd hdd){
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void getInformation(){
        System.out.println(price);
        System.out.println(model);
        ram.getRAM();
        hdd.getHDD();

    }

}
