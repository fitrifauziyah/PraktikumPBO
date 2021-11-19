package paintingshape;

/**
 *
 * @author Fitri Fauziyah
 */
public class Rectangle extends Shape {
    private double length, width;
    
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    public double area() {
        return width*length;
    }
    
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
