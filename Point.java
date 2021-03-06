public class Point {
    // need private variables x and y
    
    private int x;
    private int y;
    
    private static int numPoints = 0;

    // need constructor(s) 0 argument, 2 arguments
    public Point() {
        x = 0;
        y = 0;
        numPoints ++;
    }
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        numPoints ++;
    }

    // need setter methods

    public void setX(int xValue) {
        x = xValue;
    }

    public void setY(int yValue) {
        y = yValue;
    }

    // need getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    // need translation methods
    public void dx(int xValue) {
        x += xValue;
    }
    
    public void dy(int yValue) {
        y += yValue;
    }

    // need distanceTo() method
    public double distanceTo(Point other) {
        int xDiff = x - other.getX();
        int yDiff = y - other.getY();
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }
    
    // need toString() method
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    // need a class variable to keep track total points (put it on top)

    // need to class method to return total points (put it just below constructors)
    public static int getTotalPoints() {
        return numPoints;
    }

    // need a quadrant() method that return which quadrant the point is located 1, 2, 3, or 4

    // need a getAreaUnderCurve() method to return the area underneeth the curver
}
