import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio_1 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
     int nElemento;

     nElemento = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros para el arreglo"));

     float[] num = new float[nElemento]; //Creacion de arreglo tipo char

     //pedir elementos para llenar el arreglo
     System.out.println("Guardando los datos...");


     //Bucle for para pedir al usuario los elementos
     for(int i = 0; i  < nElemento; i++) {
      System.out.print("Posicion "+(i+1)+" Digite un numero: "); 
      num[i] =  entrada.nextFloat();
     }

     //otro bucle para mostrar todos los caracteres
     System.out.println("\nLos numeros guardados son: ");

    for(float i : num) {
      System.out.println("Numero: "+i);
    }

     entrada.close(); 
  }
}
