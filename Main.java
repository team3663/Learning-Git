public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Numbers in Java ===== https://www.w3schools.com/java/java_data_types.asp");
        System.out.println("short (2-byte): " + Short.MAX_VALUE + " ~ " + Short.MIN_VALUE);
        System.out.println("int (4-byte): " + Integer.MAX_VALUE + " ~ " + Integer.MIN_VALUE);
        System.out.println("long (8-byte): " + Long.MAX_VALUE + " ~ " + Long.MIN_VALUE);
        System.out.println("float (4-byte): " + Float.MAX_VALUE + " ~ " + Float.MIN_VALUE);
        System.out.println("double (8-byte): " + Double.MAX_VALUE + " ~ " + Double.MIN_VALUE);
        

        // need testing code
        Point p1 = new Point(3, 4);     // constructor & toString()
        System.out.println(p1);         

        p1.setX(11);                    // setter methods
        p1.setY(10);
        System.out.println(p1.getX());  // getter methods
        System.out.println(p1.getY());

        p1.dx(-6);                      // translation methods
        p1.dy(2);
        System.out.println(p1);

        Point origin = new Point(0, 0); // distanceTo() method
        System.out.println("Distance from " + origin + " to " + p1 + " is " + p1.distanceTo(origin));
    }
}