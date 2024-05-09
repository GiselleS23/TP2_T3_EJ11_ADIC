/* 11.- Realice un diagrama que muestre los 21 primeros números enteros positivos y sus respectivos cuadrados. 
Sacchetti, Maria Giselle C2*/
/* import java.util.Scanner; */
import java.lang.Math;


public class Main {
  public static void main(String[] args) {

    System.out.println("21 primeros numeros y sus cuadrados: ");
    System.out.println("numero\t\tcuadrado");

    int i;
    for (i = 1; i <= 21; i++) {
      
      System.out.println(i + "\t\t\t\t" + Math.pow(i, 2));
    }

  }
  
}