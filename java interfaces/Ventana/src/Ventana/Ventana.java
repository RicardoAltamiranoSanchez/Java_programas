
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {
   public  JPanel panel;
    public Ventana ()
           {
               this.setSize(700,700);//dar ancho y altura a la ventana
                //setLocation(400,500);//poner localizacion de la pantalla
               // setBounds(200,400,500,500);//Poner x y Y y ancho y altura
                 setMinimumSize(new Dimension(200,200));//hasta deonde se puede a chicar la pantalla
                setDefaultCloseOperation(EXIT_ON_CLOSE);//Hacer que el programa se cierre
              //setResizable(false);
              this.getContentPane().setBackground(Color.blue);//poner color a la ventana
              
                setTitle("RICARDO");//Poner nombre al titulo
                setLocationRelativeTo(null);
                componentes();
           
                
            }
    private void componentes()
    {
        Paneles();
        //Etiquetas();
      //Boton();  
        //Radiobotones();
       // Botonesdeactivacion();
      // cajasdetexto();
      //areatexto();
     // colocarcasillasdeverificacion();
     //colocarlistadesplegable();
     //colocarcampodeconstraseña();
     //colocartablas();
     colocarlistas();
     
    }
    private void Paneles()
    {
          panel=new JPanel();//constructor del panel
        panel.setLayout(null);//Desativar las configuraciones por defcto del panel
        panel.setBackground(Color.WHITE);//poner color al panel
        this.getContentPane().add(panel);//ponemos encima de la ventana el panel
        
    }
    private void Etiquetas()
    {
        
        
       // JLabel etiqueta=new JLabel();//Constructor de la etiqueta 
       /* etiqueta.setText("Hola");//Ponemos texto
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("arial",3,40));//ponemos e tipo de letra si es reucursiv y el tamaño 
        etiqueta.setBounds(10,10,100,100);//usamos la x y Y el ancho y la altura
        etiqueta.setOpaque(true);//Desativar las configuraciones por defecto de JLbabel
        etiqueta.setForeground(Color.WHITE);//poner color en la letra en la etiqueta
        etiqueta.setBackground(Color.BLACK);//poner color en fondo en la etiqueta
        */
        
      //  panel.add(etiqueta);//agregamos la etiqueta dendro del panel
        /*ImageIcon imagen=new ImageIcon(" usuario.png");//constructor de imagen
        JLabel etiqueta2=new JLabel();//
        etiqueta2.setBounds(40, 80,300, 300);
        //modificxar el tamaño de la imagen
      etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_DEFAULT)));
      panel.add(etiqueta2);*/
        
    }
    private void Boton()
    {
        //BOton de texto
        JButton boton1=new JButton();//constructor del boton
        boton1.setText("Conectar");//poner texto para un boton
        boton1.setBounds(100, 100, 70, 20);//la x y Y el ancho y la altura
        boton1.setEnabled(true);//Habilitar el boton
        boton1.setMnemonic('a');//alt y caracter para dar click
        boton1.setForeground(Color.RED);//establecemos el color del boton
        boton1.setFont(new Font("cooper black",Font.ITALIC,10));//estalecemos la fuente de letra del boton
        //boton2 de imagen
        JButton boton2=new JButton ();
        boton2.setBounds(100, 200, 100, 40);
        ImageIcon click=new ImageIcon("click.png");
        boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
       // boton2.setOpaque(true); habiltar el cambio del color de fondo del boton
        boton2.setBackground(Color.yellow);//cambiar color de fondo del boton
        //boton 3 
        JButton boton3=new JButton();
        boton3.setBounds(100, 300, 100, 50);
        //boton3.setBorder(BorderFactory.createLineBorder(Color.RED));//creaciones del borde del boton
        //boton3.setBorder(BorderFactory.createLineBorder(Color.yellow, 4));//borde con ancho de pixeles y color del borde
        boton3.setBorder(BorderFactory.createLineBorder(Color.RED, 4, false));//borde con color y ancho y si es redondeado o no
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        
    }
    private void Radiobotones()
    {
        JRadioButton radioboton1=new JRadioButton("opcion 1",true);//Clase se radio boton
        radioboton1.setBounds(50, 50, 150, 30);
        radioboton1.setEnabled(false);//Activar el boton
        radioboton1.setText("RIKI");
        radioboton1.setFont(new Font("arial", 3,20 ));//poner el tipo si el negrita o rcursiva y el tamaño
        panel.add(radioboton1);
        
          JRadioButton radioboton2=new JRadioButton("opcion 2",false);//Clase se radio boton
        radioboton2.setBounds(50, 80, 80, 30);
        panel.add(radioboton2);
        
          JRadioButton radioboton3=new JRadioButton("opcion 3",true);//Clase se radio boton
        radioboton3.setBounds(50, 100, 80, 30);
        panel.add(radioboton3);
        ButtonGroup gruporadiobotones=new ButtonGroup();//clase de grupo de botones y que solo pueda selecionar una casilla
        gruporadiobotones.add(radioboton1);
        gruporadiobotones.add(radioboton2);
        gruporadiobotones.add(radioboton3);
    }
    private void Botonesdeactivacion()
    {
        JToggleButton botonactivacion1=new JToggleButton("opcion1",true);
        botonactivacion1.setBounds(50, 50, 200, 20);
        panel.add(botonactivacion1);
        
        JToggleButton botonactivacion2=new JToggleButton("opcion2",false);
        botonactivacion2.setBounds(50, 70, 200, 20);
        panel.add(botonactivacion2);
        
        JToggleButton botonactivacion3=new JToggleButton("opcion3",false);
        botonactivacion3.setBounds(50, 90, 200, 20);
        panel.add(botonactivacion3);
        ButtonGroup grupobotonesactivacion=new ButtonGroup();
        grupobotonesactivacion.add(botonactivacion1);
        grupobotonesactivacion.add(botonactivacion2);
        grupobotonesactivacion.add(botonactivacion3);
        
        
    }
    private void cajasdetexto()
    {
        // JTextField cajatexto1 =new JTextField("jkk",50);//Clase con texto y indicando numero de columnas
        //SOlo sirve si desabilita el layout de panel es decir el diseño  panel.setLayout(null)
        JTextField cajatexto1 =new JTextField();
        cajatexto1.setBounds(100, 100, 100, 100);
        cajatexto1.setText("Puto");
        System.out.println(""+cajatexto1.getText());//obtener el texto en la caja
        panel.add(cajatexto1);
    }
    private void areatexto()
    {
        JTextArea aretexto=new JTextArea();
        aretexto.setBounds(30, 30, 200, 200);
        aretexto.setText("hola");//establecer texto
        aretexto.append(" hola ");//añadir mas texto
        aretexto.setEditable(true);//perimitir si se puede borrar el texto principal
        System.out.println(""+aretexto.getText());//obtener el area de texto
        panel.add(aretexto);
        
        //barras de dezplazaminto
        JScrollPane barrasdeplazmiento=new JScrollPane(aretexto);
        barrasdeplazmiento.setBounds(30, 30, 200, 200);
        //barra de desplazaminto vertical
        barrasdeplazmiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barra de desplazamineto horizontal
        barrasdeplazmiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //segunda forma mas facil
        //JScrollPane barrasdeplazmiento=new JScrollPane(aretexto,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel.add(barrasdeplazmiento);
    }
    //Casillas de verficacion
    private void colocarcasillasdeverificacion()
    {
        JCheckBox casilla1= new JCheckBox("opcion 1");//Constructor de casilla de verificacion
        casilla1.setBounds(20, 40, 80, 30);
        panel.add(casilla1);
        
        JCheckBox casilla2= new JCheckBox("opcion 2");//Constructor de casilla de verificacion
        casilla2.setBounds(20, 60, 80, 30);
        panel.add(casilla2);
        
        
        JCheckBox casilla3= new JCheckBox("opcion 2");//Constructor de casilla de verificacion
        casilla3.setBounds(20, 80, 80, 30);
        panel.add(casilla3);
        
        
        JCheckBox casilla4= new JCheckBox("opcion 4");//Constructor de casilla de verificacion
        casilla4.setBounds(20, 100, 80, 30);
        panel.add(casilla4);
    }
    private void  colocarlistadesplegable()
    {
        /*String [] lista={"fili","mou","kll","kkk"}; //Arreglo de string para poder pasarlo al constructor de JComboBox
        JComboBox listadesplegable =new JComboBox(lista);
        listadesplegable.setBounds(20, 60, 100, 40);
        listadesplegable.addItem("fifififi");//Agregar nuevo elemento
        listadesplegable.setSelectedItem("kkk");//seleccionar la primera vista de la lista
        
        
        panel.add(listadesplegable);*/
        
        
        Persona persona1 =new Persona("Ricardo",25,18287263);
        Persona persona2=new Persona("juan",29,2929848);
        Persona persona3=new Persona("kique",26,287429);
       DefaultComboBoxModel modelo=new DefaultComboBoxModel();//creacion del constructo para poder leer objetos o clases

        modelo.addElement(persona1);
        modelo.addElement(persona2);
        modelo.addElement(persona3);
        //Creacion con modelos de clase con JCombox
        JComboBox listadespliegable= new JComboBox(modelo);
        listadespliegable.setBounds(20, 30, 150, 40);
        panel.add(listadespliegable);
    }
    //creando campo de constraseña
    private void colocarcampodeconstraseña()
    {
        JPasswordField campoconstraseña=new JPasswordField();//constructor de campo constraseña
        campoconstraseña.setBounds(30, 20, 150, 30);
        campoconstraseña.setText("Ricardo");
        //Para poder obtener la constraseña
          String constraseña="";
          //getpasword es un metodo para poder obtner lo que esta escrito pero es un arreglo de caracteres debemos hacer esto para poder obtnerlo bien
          for (int n=0;n<campoconstraseña.getPassword().length;n++)
          {
              constraseña+=campoconstraseña.getPassword()[n];
          }
        
        System.out.println("constraseña"+constraseña);
        panel.add(campoconstraseña);
    }
    private void  colocartablas()
    {
        DefaultTableModel modelo=new DefaultTableModel();//Constructor de modelo para hacer las tablas
        //Creamos las columnas
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Edad");
        
        //neceitamos un arrgle de string para arreglar las filas
        String []persona1={"Ricardo","Altamirano","25"};
        String []persona2={"Juan","Ramirez","29"};
        String []persona3={"Miguel","nenes","23"};
        String []persona4={"Jose","Fracbes","22"};
        String []persona5={"Fernando","gomez","21"};
        //creamos las filas
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        
        //constructor de la tabla
        JTable tabla=new JTable(modelo);
        tabla.setBounds(30,30,200, 100);
        //tabla.setEnabled(false);
        panel.add(tabla);
        //es neceario hacer un scroll para que se vea bien la tablas
        JScrollPane scroll =new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED );
         scroll.setBounds(30,30, 200, 100);
         panel.add(scroll);
        
        
        
        
    }
    //Creacion de listas
    private void colocarlistas()
    {
        //Constructor de modelo es necesario para mostrar las listas
        //se puede meter adentro del constructor el objeto
        DefaultListModel modelo= new DefaultListModel();
        //Agregar un elemento ala modelo
        //Primera forma de agregar elementos
        Persona persona1=new Persona("jjjk",23,3444);
        modelo.addElement(persona1);
        //Segunda forma de agregar un elemeto
        modelo.addElement(new Persona ("Ricardo",25,2466));
        
        
        JList lista= new JList(modelo);
        lista.setBounds(30, 30, 150, 100);
        
        panel.add(lista);
        JScrollPane scroll=new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(scroll);
        
    }
}
