/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excel;

import Modelo.Conexion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ricar
 */
public class Excel {

    public static void main(String[] args) {
        // Archivo_excel();
       // Leerexcel();
      // cargar_informacion_excel_BD();
      cargar_informacion_DB_excel();
    }

    public static void Archivo_excel() {
        Workbook libro = new XSSFWorkbook();//HSSFWorkbook() es para la liberias viejas
        Sheet hoja = libro.createSheet("Hola java");
        //llenamos la hoja

        Row fila0 = hoja.createRow(0);//ceamis la fila de excel donde queremos añadir datos 
        fila0.createCell(0).setCellValue("Hola");//la añadimos en la celda (columna)
        fila0.createCell(1).setCellValue("19.0");
        fila0.createCell(2).setCellValue(true);
        //Hacemos celdas pero con formulas de excel ceamos un objeto de tipo celda para poder utilizar el metodo formula
        Cell celda = fila0.createCell(3);
        //el primer parametro es para poner la formula y el segundo son os campos que de vamos a pasar
        celda.setCellFormula(String.format("20+22", ""));

        Row fila1 = hoja.createRow(1);
        fila1.createCell(0).setCellValue("5.9");
        fila1.createCell(1).setCellValue("12.9");
        //hacemos una celda utilizando la formula 
        Cell celda1 = fila1.createCell(2);
        celda1.setCellFormula(String.format("A%d+B%d", 2, 2));
        //en froma dinamica celda1.setCellFormula(String.format("A%d+B%d", 2,2));
        

        try {
            FileOutputStream archivo = new FileOutputStream("Excel.xlsx");//Para la liberia de antes es Excel.xls
            libro.write(archivo);
            archivo.close();
        } catch (Exception ex) {
            System.out.println("Error ," + ex);
        }

    }

    public static void Leerexcel() {
        try {
            //Creamos un objeto de file para leer//verificar el errror de la informacion de  ruta
            FileInputStream archivo = new FileInputStream(new File("C:\\prueba.xlsx"));//pasamos la direecion del archivo
            //creamos un objeto de libro de lectura
            XSSFWorkbook librolectura = new XSSFWorkbook(archivo);
            //Creamos una hoja de lectura
            XSSFSheet hojalectura = librolectura.getSheetAt(0);
            //calculamos el numero de fila
            int numerofilas = hojalectura.getLastRowNum();

            for (int n = 0; n <= numerofilas; n++) {
                //creamos un objeto filas
                Row fila = hojalectura.getRow(n);
                //obtenemos el numero de columnas
                int colum = fila.getLastCellNum();
                for (int m = 0; m < colum; m++) {
                    Cell celda = fila.getCell(m);
                    //Sabemo de que tipo de daot hay cada una de las celdas
                    switch (celda.getCellTypeEnum().toString()) {
                        case "NUMERIC":
                            System.out.println(celda.getNumericCellValue() + "");
                            break;
                        case "STRING":
                            System.out.println(celda.getStringCellValue() + "");
                            break;
                        case "FORMULA":
                            System.out.println(celda.getCellFormula() + "");
                            break;
                    }//Se puede hacer haciendo en jtable con un arreglo de objets
                }
            }

        } catch (Exception ex) {
            System.err.println("Error," + ex);
        }

    }

    public static void cargar_informacion_excel_BD() {
          Conexion con = new Conexion();
            PreparedStatement ps = null;
        try {
            Connection conexion=con.getConexion();
            //Creamos un objeto de file para leer//verificar el errror de la informacion de  ruta
            FileInputStream archivo = new FileInputStream(new File("D: \\prueba.xlsx"));//pasamos la direecion del archivo
            //creamos un objeto de libro de lectura
            XSSFWorkbook librolectura = new XSSFWorkbook(archivo);
            //Creamos una hoja de lectura
            XSSFSheet hojalectura = librolectura.getSheetAt(0);
            
            //calculamos el numero de fila
            int numerofilas = hojalectura.getLastRowNum();
          
            ResultSet rs = null;
            for (int n = 1; n <= numerofilas; n++) {
                //creamos un objeto filas
                Row fila = hojalectura.getRow(n);
                ps=conexion.prepareStatement("Insert into Producto clave,nombre,cantidad,costos values(?,?,?,?)");
                ps.setString(1,fila.getCell(0).getStringCellValue());
                ps.setString(2,fila.getCell(1).getStringCellValue());
                ps.setInt(3,(int)fila.getCell(2).getNumericCellValue());
                 ps.setDouble(4,fila.getCell(3).getNumericCellValue());
                  ps.executeUpdate();
            }
            conexion.close();

        } catch (Exception ex) {
            System.err.println("Error," + ex);
        }
    }
    public static void cargar_informacion_DB_excel()
    {
           Workbook libro = new XSSFWorkbook();//HSSFWorkbook() es para la liberias viejas
        Sheet hoja = libro.createSheet("Reportes  productos");
        String [] cabeceras=new String []{"Clave","Nombre","Precio","Cantidad"};
        Row fila0=hoja.createRow(0);
        Conexion con=new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        for(int n=0; n<cabeceras.length; n++){
            Cell celda =fila0.createCell(n);
            celda.setCellValue(cabeceras[n]);
        }
                int numfila=1;
        
        try {
            Connection conexion=con.getConexion();
            ps=conexion.prepareStatement("select clave,nombre,cantidad,costo from Producto");
            rs=ps.executeQuery();
            int numero_columnas=rs.getMetaData().getColumnCount();//Obteniendo el numero de columnas en la base de datos
            
            while(rs.next())
            {
                Row fila_datos=hoja.createRow(numfila);
                for(int i=0; i<numero_columnas; i++)
                {
                    Cell celda=fila_datos.createCell(i);
                    if(i==0 || i==1)
                    {
                        celda.setCellValue(rs.getString(i+1));
                    }
                    else
                    {
                        celda.setCellValue(rs.getDouble(i+1));
                        
                        
                    }
                }
                numfila++;
            }
            FileOutputStream archivo = new FileOutputStream("ReporteProducto.xlsx");//Para la liberia de antes es Excel.xls
            libro.write(archivo);
            archivo.close();
        } catch (Exception ex) {
            System.out.println("Error ," + ex);
        }
        
        
    }

}
