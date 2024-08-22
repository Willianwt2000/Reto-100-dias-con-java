import java.util.Scanner;

//import javax.swing.JOptionPane;
public class Ejercicio_2 {
  /* Ejercicio_2
  Leer 5 numeros, guardarlos en un arreglo y mostralos en el orden inverso al introducirlo */
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    float num[] = new float[5];

    

    System.out.println("Guardando datos...");
    for (int i = 0; i < 5; i++) {
      System.out.print("Posicion " + (i + 1) + " Digite un numero: ");
      num[i] = entrada.nextFloat();
    }

    
    
    System.out.println("\nMostrando datos...");
    for (int i = 0; i < num.length; i++) {
      System.out.println("Numero: " + num[i]);
    }
    
    // Creamos un nuevo arreglo invertidos del mismo tamaño que el arreglo original
    // para almacenar los números en orden inverso.
    
    float[] invertidos = new float[num.length]; // Declaracion de arreglo invertido del mismo tamaño del arreglo original

    for (int i = 0; i < num.length; i++) {
      invertidos[i] = num[num.length - 1 - i];
    }

    System.out.print("\nArreglo invertido:\n");

    for (float i : invertidos) {
      System.out.println("Numero: "+i);
    }

    entrada.close();
  }
}
