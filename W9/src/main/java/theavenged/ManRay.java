package theavenged;

/**
 *
 * @author Fitri Fauziyah
 */
public class ManRay extends SuperHero{
    public ManRay(int powerLevel, String name) {
	super(powerLevel, name);
	super.addPower(new LaserEye());
	super.addPower(new Strength());
    }

    public void identity() {
	System.out.printf("It's %s, the ManRay! It has the power level of %d\n", this.name, this.powerLevel);
	System.out.println(".....HEED ME.....");
    }
}
