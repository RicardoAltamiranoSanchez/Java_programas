/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author ricar
 */
public class ventana3 extends JFrame {
     private JFrame ventana3;
     private JPanel panel;
     private JLabel etiqueta;
     private JLabel saludo;
     private JButton boton;
    private JTextField cajatexto;
     private JTextArea area;
    public ventana3()
    {
        setBounds(400,100, 700, 700);
        
        setTitle("evento1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarcomponentes();
        
    }
    public void iniciarcomponentes()
    {
        Panel();
        
        cajatexto();
        Boton();
       
        
    }
    private void Panel()
    {
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
       // eventodemovimientoderaton();
        oyenteruedaderaton();
    }
    
    
    private void cajatexto()
    {
        JTextArea area=new JTextArea();
        area.setBounds(80, 10, 200, 250);
      panel.add(area);  
    }
    private void Boton()
    {
        boton=new JButton();
        boton.setBounds(80, 300, 200, 20);
        boton.setText("Presione aqui");
        boton.setFont( new Font("ariel",3,10));
        panel.add(boton);
        
        //iniciacion de evento aqui
       /* saludo=new JLabel();
        
        saludo.setBounds(80,400, 200, 20);
        saludo.setFont(new Font("arial",3,20));
        panel.add(saludo);*/
        //agregando elemento de ActionListener
        //eventooyentedeaccion();
        //eventooyentederaton(); 
       
    }
    
    private void eventooyentedeaccion()
    {
        ActionListener oyenteaccion=new ActionListener() {//Consttrcuto de Oyente de accion
            @Override
            public void actionPerformed(ActionEvent ae) {//se debe sobreescribir el metodo
             saludo.setText("Hola  "+cajatexto.getText());//Indica lo que va hacer
            }
        };//siempre se pone punto y coma en este metodo
        //boton.addActionListener(oyenteaccion);// se agrega oyente de accion 
        
        
    }
    private void eventooyentederaton()
    {
        //Agregando oyente de raton -MouseListener
        MouseListener oyentederaton=new  MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                //evento MouseEvent
              //Presionar dentro  y soltar dentro del boton
              //area.append("mouseClicked");
              if(me.isAltDown())//metodo si las click y presionas la tecla alt
              {
                  area.append("Alta\n");
              }
              else if(me.isControlDown())//si las click y presionas la tecla control  
              {
                  area.append("Control\n");
                  
                  
              }
              else if(me.isShiftDown())//si las click y tiene presionada la tecla shift
              {
                  area.append("Shift\n");
                  
              }
              else if(me.isMetaDown())
              {//SI aprietas el click drecho
                      
                      {
                          
                        area.append("click derecho");
                      }
            } else
              {
               area.append("click izquierdo");
              }
              if(me.getClickCount()==2)//cuenta la cantidad de clicks
              {
                  area.append("Doble click");
              }
            }

            @Override
            public void mousePressed(MouseEvent me) {
              //solamente presionar
              //area.append("mousePressed");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                //prsionar dentro puede ser fuera o dentro
                //area.append("mouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
              //simplemente entrar en el boton
              //area.append("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent me) {
             //salir fuera del boton
            // area.append("mouseExited");
            }
        };
        boton.addMouseListener(oyentederaton);
        
    }
    private void eventodemovimientoderaton()
    {
        //movimineto del raton
        MouseMotionListener eventomovimientoderaton=new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent me) {//Cuando presiona y arrastras el raton
                area.append("MouseEvent");
            }

            @Override
            public void mouseMoved(MouseEvent me) {//solo cuando toca el panel o el componenente que lo agregaste
                
                area.append("MouseEvento");
            }
        };
        panel.addMouseMotionListener(eventomovimientoderaton);//Se agrega al panel pero con el mismo nombre del metodo
    }
    public void oyenteruedaderaton()
    {
        //oyente de raton
        MouseWheelListener ruedaraton=new MouseWheelListener() {//se instancia la clase
            @Override
            public void mouseWheelMoved(MouseWheelEvent mwe) {//tiene metodo abstracto solo uno
               if(mwe.getWheelRotation()==-1)//de la bola de raton si va hacia arriba
               {
                   area.append("Movimineto hacia arriba");
               }
               if(mwe.getWheelRotation()==1)//lee el movimineto de raton si va hacia abajo
               {
                   area.append("Movimiento hacia abajo");
               }
            }
        };
        
        panel.addMouseWheelListener(ruedaraton);//Se agrega al panel pero con el mismo nombre del metodo
    }
    
}
