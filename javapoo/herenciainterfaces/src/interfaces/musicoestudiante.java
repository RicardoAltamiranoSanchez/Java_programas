/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ricar
 */
public class musicoestudiante implements Musico,Estudiante {
    @Override
    public void hablar()
    {
        System.out.println("Hablando");
    }
    @Override
    public void tocar()
    {
        System.out.println("Tocando");
    }
    @Override
    public void estudiar()
    {
        System.out.println("Estudiando");
    }
    
}
