package theavenged;

/**
 *
 * @author Fitri Fauziyah
 */
public class DirtyBubble extends SuperHero{
    public DirtyBubble(int powerLevel, String name) {
	super(powerLevel, name);
	super.addPower(new Flying());
	super.addPower(new Strength());
    }

    public void identity() {
	System.out.printf("It's %s, the DirtyBubble! It has the power level of %d\n", this.name, this.powerLevel);
	System.out.println(".....HEED ME.....");
    }
}
