package Figure;

 public  class Circle extends Figure {
     private double radius;

     public Circle(double radius) {
         this.radius = radius;
     }

     public double getRadius() {
         return radius;
     }

     @Override
     public double getPerimeter() {
         return 2 * getRadius() * 3.14;
     }

     @Override
     public double getSquare() {
         return Math.pow(getRadius(), 2) * 3.14;
     }
 }
