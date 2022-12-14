/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.tallerenum;

/**
 *
 * @author josep
 */
public enum Grupal {
    mensualg(9),anualg(90);
    private double cost;
    private Grupal(final double cost){
        this.cost=cost;
    }
    public double getCost(){
        double iv=0;
        double tp=0;
        iv = cost*0.18;
        
        if (this== mensualg) {
            
            return cost+iv;
        } else {
            if (this==anualg) {
                return cost+iv;
            } 
        }
        return cost;
    }
}
