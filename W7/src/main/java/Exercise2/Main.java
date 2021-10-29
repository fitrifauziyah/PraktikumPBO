package Exercise2;

/**
 *
 * @author Fitri Fauziyah
 */
public class Main {
    public static void main (String[] args) {
        //test all the methods defined in Shape
//        Shape s1 = new Shape();
//        System.out.println(s1.toString());
//        Shape s2 = new Shape("black",false);
//        System.out.println(s2.toString());
//        s1.setColor("blue");
//        s1.setFilled(false);
//        System.out.println(s1.getColor()+"\n"+s1.isFilled());
        
        Circle c1 = new Circle(7,"white",false);
        Rectangle r1 = new Rectangle(7,3,"brown",true);
        Square sq1 = new Square(5,"orange",true);
        
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(sq1.toString());
    } 
}
