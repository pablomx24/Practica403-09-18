/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author Carlos Hernandez
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       saludoteam();
       Update1PM();
       Update1CAHG();
       Update2CAHG(); 
       sumaCarlos();
    }
    public static void saludoteam(){
    
     System.out.println("No pudo El Brian !!!");
    }
    public static void Update1PM(){
        System.out.println("va el primer Update");
        System.out.println("Esta es mi Segunda UpdatePM");
    }
    
    public static void Update1CAHG(){
        System.out.println("Actualizado");
    }
    
    public static void Update2CAHG(){
        System.out.println("Segunda Actualizacion");
    }
    
    public static void sumaCarlos(){
        
        int x = 0;
        int y = 0;
        
        System.out.print("Ingrese un numero: \n>> ");
        Scanner dato1 = new Scanner (System.in);
        x = dato1.nextInt();
        
        System.out.print("Ingrese otro numero: \n>> ");
        Scanner dato2 = new Scanner (System.in);
        y = dato2.nextInt();
        
        int resultado = x + y;
        
        
        System.out.println("El resultado de la suma es: \n" + resultado);
    }
    
}
