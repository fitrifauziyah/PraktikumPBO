/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

/**
 *
 * @author Fitri Fauziyah
 */
public class Engineer implements Employee {
    private double salary;
    
    private double getSalary(double percentage) {
        double netSalary;
        double pfamount=salary*percentage;
        netSalary=salary-pfamount;
        return netSalary;
    }
}
