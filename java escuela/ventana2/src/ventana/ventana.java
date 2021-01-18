
package ventana;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
public class ventana extends JFrame{
    public JPanel panel;
    public ventana(){
       this.setSize(500,500);//establecemos el tamaÃ±o de la ventana
         setTitle("Hola Bienvenido:");//Establecemos el titulo de la ventana
        //setLocation(400,200);//establecemos la posicion de la ventana
          //setBounds(500,500,400,200);establecemo la pÃ³sicion inicia y el tamaÃ±o de la ventana 
          setLocationRelativeTo(null);//establecemos la pantalla en el centro
          //setResizable(false);//establecemos si la ventana puede cambiar de tamaÃ±o o no
          setMinimumSize(new Dimension(200,200));//establecemos el tamaÃ±o minimo
          this.getContentPane().setBackground(Color.BLUE);//establecemos el color
          
   inciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void inciarComponentes (){
        //colocarpaneles();
       // colocaretiquetas();
       //colocarbotones();
       //colocarRadiobotones();
      // colocarcajasdetexto();
      //colocarareasdetexto();
      //colocarlistasdesplegables();
    }
            
            
            
            private void colocarpaneles(){
         panel = new JPanel ();//creacion de un panel
        //panel.setBackground(Color.yellow);
        panel.setLayout(null);
         this.getContentPane().add(panel); //agregamos el panel en la ventana
            }
       private void colocaretiquetas(){
           
        JLabel etiqueta = new JLabel("HOLA",SwingConstants.CENTER);//creamos una etiqueta de texto
       // etiqueta.setText("HOLA");// creamos una etiqueta senguda manera
       //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);establecemos la alineacion horizontal del texto segunda manera
        etiqueta.setBounds(85,110,300,80);
        etiqueta.setForeground(Color.WHITE);//establecemos el color de la etiqueta "letra"
        etiqueta.setBackground(Color.BLACK);//ESTABLECEMOS EL COLOR DEL FONDO ALA ETIQUETA
        etiqueta.setOpaque(true);//establecemo pintar el fondo de la etiqueta
        etiqueta.setFont(new Font("chiller",3,30));//establecemos la fuente del texto
        panel.add(etiqueta);//agregamos la etiqueta al panel
        //etiqueta 2 tipo imagen
        ImageIcon imagen = new ImageIcon("goku.JPG");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(80,90,500,681);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
        
       }
       private void colocarbotones(){
           //boton 1 y es un boton de texto
           JButton boton = new JButton("click");
           //boton1.setText("click");//establecemos un textoal boton
           boton.setBounds(100,100,100,40);
           boton.setEnabled(true);//establecemos el encendido del boton
           //boton1.setMnemonic("a");
           boton.setForeground(Color.PINK);//establecemos elcolor  de la letra del boton
           boton.setFont(new Font("chiller",3,20));
           panel.add(boton);
           
           //boton 2 boton de imagen
           JButton boton2 = new JButton();
           boton2.setBounds(100,200,100,40);
           boton2.setBackground(Color.BLUE);//ESTABLECEMOS EL COLOR DEL FONDO DEL BOTON
           ImageIcon g3 = new ImageIcon ("g2.JPG");
           boton2.setIcon(new ImageIcon(g3.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
          panel.add(boton2); 
           
       }
       private void colocarRadiobotones(){
         JRadioButton radioboton1 = new JRadioButton("opcion 1",true);
         radioboton1.setBounds(50,100,100,50);
         panel.add(radioboton1);
         
         JRadioButton radioboton2 = new JRadioButton("opcion 2",true);
         radioboton2.setBounds(50,150,100,50);
         panel.add(radioboton2);
         
         JRadioButton radioboton3 = new JRadioButton("opcion 3",true);
         radioboton3.setBounds(50,200,100,50);
         panel.add(radioboton3);
         
         JRadioButton radioboton4 = new JRadioButton("opcion 4",true);
         radioboton4.setBounds(50,250,100,50);
         panel.add(radioboton4);
         
         ButtonGroup grupoRadiobotones = new ButtonGroup ();
         grupoRadiobotones.add(radioboton1);
         grupoRadiobotones.add(radioboton2);
         grupoRadiobotones.add(radioboton3);
         grupoRadiobotones.add(radioboton4);
       }
       private void colocarcajasdetexto(){
           JTextField cajatexto= new JTextField ("hola",50);//numero de columnas
           cajatexto.setBounds(50,50,200,30);
           //System.out.println("texto en la caja"+cajatexto.getText());
           panel.add(cajatexto);
           
       }
       private void colocarareasdetexto(){
           JTextArea areatexto =new JTextArea ();
           areatexto.setBounds(20,20,300,200);
           areatexto.setText("escriba el texto aqui....");
          areatexto.append("escribe por aqui");//añade mas texto al area
          areatexto.setEditable(true);//establecer el editado del area del texto
           System.out.println("el texto es"+areatexto.getText());
           panel.add(areatexto);
       }
       private void colocarlistasdesplegables(){
           String[] paises={"mexico","venezuela","ecuador","honduras","colombia"};
           
           
           JComboBox listadesplegable1 = new JComboBox (paises);
           listadesplegable1.setBounds(20,20,100,30);
           listadesplegable1.addItem("holanda");//puedes agregar objetos despues de haberlo iniciado
          //listadesplegable1.setSelectedItem("ecuador");//seleccionar la ubicacion del primer objeto que se vea
           panel.add(listadesplegable1);
           
           
       }
       //agregando evento de tipo de ActionListener
      
       }
    
            
    

