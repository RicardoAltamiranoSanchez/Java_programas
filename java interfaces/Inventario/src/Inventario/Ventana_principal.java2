/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author ricar
 */
public class Ventana_principal extends JFrame {
    public Ventana_principal()
    {
        //Ventana principal
        JFrame Ventana1= new JFrame();
        this.setSize(600,600);
        setLocationRelativeTo(null);
        setTitle("DEMO");
         
        this.getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //panel 1
        componentes();
        
    }
    private void componentes()
    {
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        this.getContentPane().add(panel);
        
        //etiqueta de usuario
       JLabel etiqueta1=new JLabel();
        etiqueta1.setText("INVENTARIO");
       etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta1.setFont(new Font("arial",1,20));
        etiqueta1.setBounds(220, 10,150 , 20);
        etiqueta1.setForeground(Color.BLACK);
        etiqueta1.setBackground(Color.BLUE);
        etiqueta1.setOpaque(true);
        panel.add(etiqueta1);
        //imagen
        JLabel etiqueta2= new JLabel(new ImageIcon("usuario.png"));
        etiqueta2.setBounds(160, 10, 300, 340);
        panel.add(etiqueta2);
        
        //nombre usuario
         JLabel etiqueta3=new JLabel();
        etiqueta3.setText("USER");
       etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta3.setFont(new Font("arial",1,20));
        etiqueta3.setBounds(220, 10,150 , 630);
        etiqueta3.setForeground(Color.BLACK);
        etiqueta3.setBackground(Color.BLUE);
        etiqueta3.setOpaque(true);
        panel.add(etiqueta3);
        
        
    }
    
}
