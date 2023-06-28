package TasksMain;

public class ExceptionABC extends Exception{
    public ExceptionABC(String msg){
        super(msg);
        System.out.println(msg);
    }
}
