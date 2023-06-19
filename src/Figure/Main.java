package Figure;
import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        Figure[] figures = new Figure[]{
                new Rectangle(7, 9),
                new Rectangle(3, 12),
                new Triangle(5,7,9),
                new Circle(6),
                new Circle(9)
        };
        System.out.println("The sum of the perimeter of all figures: " + getSum(figures));
    }
    public static double getSum(Figure[] figures){
        double sum = 0;
        for (Figure figure : figures){
            sum += figure.getPerimeter();
        }
        return sum;
    }
    }

