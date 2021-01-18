/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventosteclado;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.tree.DefaultTreeCellEditor;

/**
 *
 * @author ricar
 */
public class ventana_teclado extends JFrame {
     private JTextArea caja;
     private JTextField area;
    private JPanel panel;
   
    
    {
        this.setSize(700,700);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        componentes();
    }
    private  void componentes()
    {
        
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        this.getContentPane().add(panel);
        
       
        areatexto();
        cajaareatexto();
        eventosteclado();
        
        
    }
    private void areatexto()
    {
        area=new JTextField();
        area.setBounds(20, 20, 100, 30);
        panel.add(area);
        //JScrollPane scroll=new JScrollPane(area,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //panel.add(scroll);
    }
    private void cajaareatexto()
    {
        caja=new JTextArea();
        caja.setBounds(150, 20, 300, 400);
        panel.add(caja);
        
        
    }
   private void eventosteclado()
   {
       KeyListener eventoteclado=new KeyListener() {
           @Override
           public void keyTyped(KeyEvent ke) {//solo admite las letras y numeros los ctl p shift no los admite
               //caja.append(" keyTyped\n");
           }

           @Override
           public void keyPressed(KeyEvent ke) {//evento del teclado presionando cualquier tecla del teclado
               //caja.append("keyPressed\n");
           }

           @Override
           public void keyReleased(KeyEvent ke) {//Presionar y soltar cualquier tecla 
              caja.append("keyReleased");
              //con condicionales
              if(ke.getKeyChar()==  'p')
              {
                  caja.append("Presiono la p");
              }
              
              if(ke.getKeyChar()==  '\n')
              {
                  caja.append("Presiono el enter\n");
              }
              
              if(ke.getKeyChar()==  ' ')
              {
                  caja.append("Presiono el espacio\n");
              }
           }
       };
       caja.addKeyListener(eventoteclado);//Se pasa el evento al dondde quiere que se ejecute la accion
   }
    
}
