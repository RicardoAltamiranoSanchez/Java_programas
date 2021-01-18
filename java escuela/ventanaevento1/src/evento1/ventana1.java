/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evento1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author ricar
 */
public class ventana1 extends JFrame {
     private JFrame ventana;
     private JPanel panel;
     private JLabel etiqueta;
     private JLabel saludo;
     private JButton boton;
    private JTextField cajatexto;
    
    public ventana1()
    {
        setBounds(400,100, 700, 700);
        
        setTitle("evento1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarcomponentes();
    }
    public void iniciarcomponentes()
    {
        Panel();
        Etiqueta();
        Cajatexto();
        Boton();
    }
    private void Panel()
    {
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }
    private void Etiqueta()
    {
        etiqueta=new JLabel();
        etiqueta.setText("Ingrese su nombre");
        etiqueta.setBounds(30, 20, 300, 30);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("arial",3,20));
        panel.add(etiqueta);
        
        
    }
    private void Cajatexto()
    {
        cajatexto=new JTextField();
        cajatexto.setBounds(50 ,50, 200, 30);
        panel.add(cajatexto);
        
    }
    private void Boton()
    {
        boton=new JButton();
        boton.setBounds(80, 80, 200, 20);
        boton.setText("Presione aqui");
        boton.setFont( new Font("ariel",3,10));
        panel.add(boton);
        
        //iniciacion de evento aqui
        saludo=new JLabel();
        
        saludo.setBounds(80,120, 200, 20);
        saludo.setFont(new Font("arial",3,20));
        panel.add(saludo);
        //agregando elemento de ActionListener
        
        ActionListener oyenteaccion=new ActionListener() {//Consttrcuto de Oyente de accion
            @Override
            public void actionPerformed(ActionEvent ae) {//se debe sobreescribir el metodo
             saludo.setText("Hola  "+cajatexto.getText());//Indica lo que va hacer
            }
        };//siempre se pone punto y coma en este metodo
        boton.addActionListener(oyenteaccion);// se agrega oyente de accion 
    }
}
