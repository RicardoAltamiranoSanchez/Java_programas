import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Seleccione una conversion");
      System.out.println("1. ºC  a  ºF");
      System.out.println("2. ºF  a  ºC");
      int n=sc.nextInt();
      if(n==1){
          System.out.println("Ingresa grados centigrados");
          int c=sc.nextInt();
          double f=(c*9/5)+(32);
          System.out.println(c+"ºC equivale a "+f+"ºF");
      }else{
          System.out.println("Ingresa grados fahrenheit");
          int f=sc.nextInt();
          double c=(f-32)*5/9;
          System.out.println(f+"ºF equivale  a "+c+"ºC");
      }
    }
}