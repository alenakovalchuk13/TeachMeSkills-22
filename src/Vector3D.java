public class Vector3D implements VectorMethods{
    private double x;
    private double y;
    private double z;

    private final String info = "Это вектор для двумерной системы координат";

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double getLength(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProduct(Vector3D vector3D) {
        return x * vector3D.getX() + y * vector3D.getY() + z * vector3D.getZ();
    }
    public Vector3D multiply(Vector3D vector3D) {
        return new Vector3D(x + vector3D.getX(), y + vector3D.getY(), z + vector3D.getZ());
    }

    public Vector3D subtract(Vector3D vector3D) {
        return new Vector3D(x - vector3D.getX(), y - vector3D.getY(), z - vector3D.getZ());
    }
    public static Vector3D[] staticMethod(int number) {
        Vector3D[] vector3DS = new Vector3D[number];
        for (int i = 0; i < number; i++) {
            vector3DS[i] = new Vector3D(Math.random(), Math.random(), Math.random());
        }
        return vector3DS;
    }

    public boolean compare(Vector3D vector3D){
        return (this.x == vector3D.getX() && this.y == vector3D.getY() && this.z == vector3D.getZ());
    }

    @Override
    public String toString() {
        return info + ", coordinates: " + x + y + z;
    }
}

