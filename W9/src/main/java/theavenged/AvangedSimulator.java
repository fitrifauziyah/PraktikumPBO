package theavenged;

import java.util.*;

/**
 *
 * @author Fitri Fauziyah
 */
public class AvangedSimulator {
    public static void main(String[] args) {
        List<SuperHero> SuperHeroList = new ArrayList();

        SuperHeroList.add(new ManRay(0, "Gennichiro"));
        SuperHeroList.add(new FlyingDutchMan(225, "Shirai"));
        SuperHeroList.add(new ManRay(553, "Gyoubu Masataka Oniwa"));
        SuperHeroList.add(new DirtyBubble(70, "Billie"));
        SuperHeroList.add(new FlyingDutchMan(1000, "Budi"));

        for(int i = 0; i < 5; i++) {
            System.out.println("========================================================================");
            SuperHeroList.get(i).identity();
            SuperHeroList.get(i).showPowers();
        }
        System.out.println("========================================================================");
    }
}
