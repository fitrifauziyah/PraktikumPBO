package theavenged;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fitri Fauziyah
 */
public abstract class SuperHero {
    protected int powerLevel;
    protected String name;
    protected List<Power> powerList;
    
    public SuperHero(int powerLevel, String name) {
	this.powerLevel = powerLevel;
	this.name = name;
	powerList = new ArrayList<Power>();
    }
	
    public int getPowerLevel() {
	return powerLevel;
    }

    public String getName() {
	return name;
    }

    public void addPower(Power power) {
	powerList.add(power);
    }

    abstract void identity();

    public void showPowers() {
	System.out.println("TIME TO SHOW YOU MY POWERS");
	for (Power p : powerList)
            p.doPower();
    }
}
