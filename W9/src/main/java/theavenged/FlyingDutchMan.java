package theavenged;

/**
 *
 * @author Fitri Fauziyah
 */
public class FlyingDutchMan extends SuperHero{
    public FlyingDutchMan(int powerLevel, String name) {
	super(powerLevel, name);
	super.addPower(new Flying());
	super.addPower(new LaserEye());
    }

    public void identity() {
        System.out.printf("It's %s, the FlyingDutchMan! It has the power level of %d\n", this.name, this.powerLevel);
	System.out.println(".....HEED ME.....");
    }
}
