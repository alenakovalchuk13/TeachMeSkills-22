package computer;

public class Hdd {
    private String name;
    private int amountMemory;
    private String type;

    public Hdd(){

    }

    public Hdd(String name, int amountMemory, String type){
        this.name = name;
        this.amountMemory = amountMemory;
        this.type = type;
    }





    public void getHDD(){
    System.out.println("The RAM name:"  + name + "has the amount of memory: "  + amountMemory);
    }


}
