/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no3;

/**
 *
 * @author Fitri Fauziyah
 */
public class no3 {
    function calculateSpecialDealTotal(){
    Private int price, priceDelivery,quantity;
    Private double weight, total;
    weight = 0.95;
    if (isSpecialDeal()) {
        total = (((price * quantity) +
        (priceDelivery * weight))
        –“10000”) ;
        send(total);
    }
    else {
        total = (price * quantity) +
        (priceDelivery * weight) ;
        send(total);
    }}
}
