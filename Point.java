public class Point {
    // need private variables x and y
    
    private int x;
    private int y;
    private boolean mergeConflict = true;
    private static int numPoints = 0;

    // need constructor(s) 0 argument, 2 arguments
    public Point() {
        x = 0;
        y = 0;
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

    // need distanceTo() method

    // need toString() method

    // need a class variable to keep track total points (put it on top)

    // need to class method to return total points (put it just below constructors)

    // need a quadrant() method that return which quadrant the point is located 1, 2, 3, or 4
}
