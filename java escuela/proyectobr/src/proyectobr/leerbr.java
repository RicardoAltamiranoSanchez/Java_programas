/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStreamReader;
/**
 *
 * @author ricar
 */
public class leerbr {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try{
            
        System.out.print("Introduce un nombre");
        String nombre=br.readLine();
        
        }catch(IOException ignorar){}
        
        
    }
    
}
