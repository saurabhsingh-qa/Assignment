import java.util.*;

/**
 * this class is used to find the area of various shape like circle, rectangle,
 * sqare and triangle.
 */
public class Area {

    public int circle() {
        int side;
        Scanner scan = new Scanner(System.in);
        side = scan.nextInt();
        return 3.14 * side * side;
    }

    public int rectangle() {
        int length, breadth;
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        breadth = scan.nextInt();
        return length * breadth;
    }

    public int square() {
        int side;
        Scanner scan = new Scanner(System.in);
        side = scan.nextInt();
        return side * side;
    }

    public float triangle() {
        int altitude, base;
        Scanner scan = new Scanner(System.in);
        altitude = scan.nextInt();
        base = scan.nextInt();
        return (base * altitude / 2);
    }

    public static void main(String[] args) {

        String shape;
        Scanner scan = new Scanner(System.in);
        shape = scan.next();
        Area a = new Area();
        if (shape.equalsIgnoreCase("CIRCLE")) {
            System.out.println("Area of " + shape + "is " + a.circle());
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            System.out.println("Area of " + shape + "is " + a.rectangle());
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            System.out.println("Area of " + shape + "is " + a.square());
        } else if (shape.equalsIgnoreCase("TRIANGLE")) {
            System.out.println("Area of " + shape + "is " + a.triangle());
        } else {
            System.out.println("Wrong input");
        }
        scan.close();

    }

}