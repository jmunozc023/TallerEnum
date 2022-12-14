/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerenum;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Administracion {
    private Scanner scanner;
    private int sel;
    public void menu(){
        scanner= new Scanner(System.in);
        do {
            System.out.println("***********************************");
            System.out.println("***************Menu****************");
            System.out.println("***********************************");
            System.out.println("* 1- Suscripcion gratiuta         *");
            System.out.println("* 2- Suscripcion Mensual          *");
            System.out.println("* 3- Suscripcion Anual            *");
            System.out.println("* 0- Salir                        *");
            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println("Elija una opcion");
            sel=scanner.nextInt();
            switch (sel) {
                case 1: 
                    System.out.println("El total de su compra es "+Simple.gratuita.getCost()+" Disponible solo por el primer mes");
                    break;
                case 2:
                    int num;
                    System.out.println("Digite el numero de personas para las que seria la suscripcion");
                    scanner= new Scanner(System.in);
                    num= scanner.nextInt();
                    if (num==1) {
                        System.out.println("El total de su compra es "+Simple.mensual.getCost());
                    } else {
                        if (num>1) {
                            System.out.println("El total de su compra es "+num*Grupal.mensualg.getCost());                            
                        } else {
                            System.out.println("Elija otro numero");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite el numero de personas para las que seria la suscripcion");
                    scanner= new Scanner(System.in);
                    num= scanner.nextInt();
                    if (num==1) {
                        System.out.println("El total de su compra es "+Simple.anual.getCost());
                    } else {
                        if (num>1) {
                            System.out.println("El total de su compra es "+num*Grupal.anualg.getCost());                            
                        } else {
                            System.out.println("Elija otro numero");
                        }
                    }
                    break;
                default:
                    System.out.println("Seleccion erronea digite nuevamente");
            }
        } while (sel!= 0);
    }
}
