/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightmanagement;

/**
 *
 * @author Fitri Fauziyah
 */
public class Passenger {
    
    private String name;
    private boolean vip;

    public Passenger(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isVip() {
        return vip;
    }
}
