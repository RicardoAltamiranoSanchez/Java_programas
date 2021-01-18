/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero=0,suma=0;
        for(int n=0; n<10; n++)
        {
            Scanner get = new Scanner(System.in);
            System.out.println("Digite un numero");
            numero=get.nextInt();
            suma+=numero;
        }
        System.out.println("La suma total es:"+suma);
    }
    
}
