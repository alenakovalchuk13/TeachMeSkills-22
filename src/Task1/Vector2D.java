package Task1;

public class Vector2D {
    private double x;
    private double y;

    private final String info = "Это вектор для двумерной системы координат";

    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double getLength() {
        return Math.sqrt(x * x + y * y);
    }

    public double scalarProduct(Vector2D vector2D) {
        return x * vector2D.getX() + y * vector2D.getY();
    }
    public Vector2D multiply(Vector2D vector2D) {
        return new Vector2D(x + vector2D.getX(), y + vector2D.getY());
    }

    public Vector2D subtract(Vector2D vector2D) {
        return new Vector2D(x - vector2D.getX(), y - vector2D.getY());
    }
    public static Vector2D[] staticMethod(int number) {
        Vector2D[] vector2DS = new Vector2D[number];
        for (int i = 0; i < number; i++) {
            vector2DS[i] = new Vector2D(Math.random(), Math.random());
        }
        return vector2DS;
    }

    public boolean compare(Vector2D vector2D){
        return (this.x == vector2D.getX() && this.y == vector2D.getY());
    }

    @Override
    public String toString() {
        return info + ", coordinates: " + x + ", " + y;
    }
}

