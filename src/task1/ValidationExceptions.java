package task1;

public class ValidationExceptions extends Exception{
    public ValidationExceptions(String msg){
        super(msg);
        System.out.println(msg);

    }

}
