package paintingshape;

public class Paint {
    private double coverage;
    
    public Paint(double c) {
        coverage = c;
    }
    
    public double amount(Shape s) {
        System.out.println("Coumputing amount for " + s);
        return s.area() / coverage;
    }
}
