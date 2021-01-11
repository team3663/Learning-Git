public class Point {
    private int x;
    private int y;

    // need constructor(s)
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
}
