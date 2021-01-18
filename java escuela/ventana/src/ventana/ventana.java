
package ventana;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class ventana extends JFrame{
    public ventana(){
       this.setSize(500,500);//establecemos el tamaño de la ventana
         setTitle("Hola Bienvenido:");//Establecemos el titulo de la ventana
        //setLocation(400,200);//establecemos la posicion de la ventana
          //setBounds(500,500,400,200);establecemo la pósicion inicia y el tamaño de la ventana 
          setLocationRelativeTo(null);//establecemos la pantalla en el centro
          //setResizable(false);//establecemos si la ventana puede cambiar de tamaño o no
          setMinimumSize(new Dimension(200,200));//establecemos el tamaño minimo
          this.getContentPane().setBackground(Color.BLUE);//establecemos el color
          
   inciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void inciarComponentes (){
        JPanel panel = new JPanel ();//creacion de un panel
        //panel.setBackground(Color.yellow);
        panel.setLayout(null);
        this.getContentPane().add(panel); //agregamos el panel en la ventana
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

    private void colocarpaneles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object g3getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
            
    
}
