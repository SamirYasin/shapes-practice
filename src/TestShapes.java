import java.util.ArrayList;

/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

public class TestShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.5 ,6);
        Square square = new Square(2.5);
        Circle circle = new Circle(4);
        /*
        This will be our actual program that we request some information from user to create 3 objects
        We will create 1 Rectangle, 1 Square and 1 Circle object

        Information to create objects will be as below
         -width of the rectangle = 5.5
         -height of the rectangle = 6
         -side of the square = 2.5
         -radius of the circle = 4


         Then print each object
         And print area and perimeters of each object
         Find and print the object which has the largest area

         EXPECTED OUTPUT:
         Circle{radius=4.0}
         Area of the Circle is = 50.24
         Perimeter of the Circle is = 25.12

         Rectangle{width=5.5, height=6.0}
         Area of the Rectangle is = 33.0
         Perimeter of the Rectangle is = 23.0

         Square{side=2.5}
         Area of the Square is = 6.25
         Perimeter of the Square is = 10.0

         Circle has the largest area as 50.24
         */

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);

        System.out.println("Area of the circle is " + circle.area());
        System.out.println("Perimeter of the circle is " + circle.perimeter());
        System.out.println("Area of the square is " + circle.area());
        System.out.println("Perimeter of the square is " + circle.perimeter());
        System.out.println("Area of the rectangle is " + rectangle.area());
        System.out.println("Perimeter of the rectangle is " + rectangle.perimeter());

      Object[] o = {circle,rectangle,square};
      double[] shapesArea = {circle.area(), rectangle.area(), square.area()};
      Object obj = o[0];
      double largestArea = shapesArea[0];

        for (int i = 0; i < o.length; i++) {
            if(shapesArea[i] > largestArea){
                largestArea = shapesArea[i];
                obj = o[i];
            }
        }
        System.out.println(obj + " has the largest area with " + largestArea);
    }
}
