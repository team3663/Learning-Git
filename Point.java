public class Point {
    // master merge test

    // need private variables x and y
    private int x;
    private int y;

    // need constructor(s) 0 argument, 2 arguments
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // need setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // need getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // need translation methods
    public void dx(int x) {
        this.x += x;
    }

    public void dy(int y) {
        this.y += y;
    }

    // need distanceTo() method
    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2));
    }

    // need toString() method
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // need a class variable to keep track total points (put it on top)

    // need to class method to return total points (put it just below constructors)

    // need a quadrant() method that return which quadrant the point is located 1, 2, 3, or 4
}
