package computer;

public class RAM {
    private String name;
    private int amountMemory;
    public RAM(){

    }

    public RAM (String name, int amountMemory){
        this.name = name;
        this.amountMemory = amountMemory;
    }
    public void getRAM(){
        System.out.println("The RAM name: " + name + "has the amount of memory: " + amountMemory);
    }
}
