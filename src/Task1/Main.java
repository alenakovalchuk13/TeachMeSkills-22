package Task1;

public class Main {
    public static void main(String[] args) {
        Vector2D vector2D1 = new Vector2D(1, 4);
        Vector2D vector2D2 = new Vector2D(4, 3);
        Vector3D vector3D1 = new Vector3D(3,3,4);
        Vector3D vector3D2  = new Vector3D(4,3,8);


        System.out.println("The first vector: " + vector2D1);
        System.out.println(vector2D1.getLength());

        System.out.println("The second vector: " + vector2D2);
        System.out.println(vector2D2.getLength());
        System.out.println(vector2D1.compare(vector2D2));

        System.out.println(vector2D1.scalarProduct(vector2D2));
        System.out.println(vector2D1.multiply(vector2D2));

        Vector2D[] vector2DS = Vector2D.staticMethod(2);
        System.out.println(vector2DS[0]);
        System.out.println(vector2DS[1]);

        System.out.println("/////////////////////////////////////////////");

        System.out.println("The first vector: " + vector3D1);
        System.out.println(vector3D1.getLength());

        System.out.println("The second vector: " + vector3D2);
        System.out.println(vector3D2.getLength());
        System.out.println(vector3D1.compare(vector3D2));

        System.out.println(vector3D1.scalarProduct(vector3D2));
        System.out.println(vector3D1.multiply(vector3D2));

        Vector3D[] vector3DS = Vector3D.staticMethod(2);
        System.out.println(vector3DS[0]);
        System.out.println(vector3DS[1]);


    }
}
