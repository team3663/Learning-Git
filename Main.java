public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

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