import java.io.IOException;

public class Calculator {
    History history = new InMemoryHistory();

    public double calculate(double num1, double num2, String type)  {
        switch (type) {
            case "sum":
                double v1 =  num1 + num2;
                Operation operation1 = new Operation(num1,num2,type,v1);
                history.writeHistory(operation1);
                return v1;
            case "sub":
                double v2 =  num1 - num2;
                Operation operation2 = new Operation(num1,num2,type,v2);
                history.writeHistory(operation2);
                return v2;
            case "mul":
                double v3 = num1 * num2;
                Operation operation3 = new Operation(num1,num2,type,v3);
                history.writeHistory(operation3);
                return v3;
            case "div":
                double v4 = num1 / num2;
                Operation operation4 = new Operation(num1,num2,type,v4);
                history.writeHistory(operation4);
                return v4;
        }
        return 0;
    }
}
