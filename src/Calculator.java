import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calculator {


    private static final OperationStorage history = new FileOperationStorage();

    public  double calculate(double num1, double num2, String type)  {
        switch (type) {
            case "sum":
                double v1 =  num1 + num2;
                Operation operation1 = new Operation(num1,num2,type,v1);
                operation1.setCreatedDate(LocalDate.now());
                history.writeHistory(operation1);
                return v1;
            case "sub":
                double v2 =  num1 - num2;
                Operation operation2 = new Operation(num1,num2,type,v2);
                operation2.setCreatedDate(LocalDate.now());
                history.writeHistory(operation2);
                return v2;
            case "mul":
                double v3 = num1 * num2;
                Operation operation3 = new Operation(num1,num2,type,v3);
                operation3.setCreatedDate(LocalDate.now());
                history.writeHistory(operation3);
                return v3;
            case "div":
                double v4 = num1 / num2;
                Operation operation4 = new Operation(num1,num2,type,v4);
                operation4.setCreatedDate(LocalDate.now());
                history.writeHistory(operation4);
                return v4;

        }
        throw new RuntimeException();
    }


    public static List<String> getHistory() {
        List<Operation> all = history.findAll();
        List<String> result = new ArrayList<>();
        for (Operation operation : all) {
            result.add("Result = " + operation.getNum1() + " " + operation.getNum2() + " " + operation.getResult() + " " + operation.getCreatedDate());
        }
        return result;
    }

}
