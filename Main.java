public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // need testing code
        Point p1 = new Point();
        p1.dx(3);
        p1.dy(4);
        System.out.println(p1);
        
        Point p2 = new Point(5, 12);
        System.out.println(p2);

        Point p3 = new Point(-3,-4);
        System.out.println(p3);
        System.out.println(Point.getTotalPoints());
        
        System.out.println("shooting pod is cool");
        System.out.println("Hello");
<<<<<<< HEAD
        System.out.println("merge Conflict");
=======
        System.out.println("Yesss");
>>>>>>> 5b9c4527ce92879588ee7dd2f40057f6ff8e8b5a
    }
}