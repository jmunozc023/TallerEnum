/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.tallerenum;

/**
 *
 * @author josep
 */
public enum Simple {
    mensual (11), anual(100), gratuita(0);
    private double cost;
    
    private Simple(final double cost){
        this.cost=cost;
    }
    
    public double getCost(){
        double iv=0;
        double tp=0;
        iv = cost*0.18;
        
        if (this== mensual) {
            
            return cost+iv;
        } else {
            if (this==anual) {
                return cost+iv;
            } else {
                if (this== gratuita) {
                    return cost;
                }
            }
        }
    return cost;
    }
}
