import java.util.Scanner;

import javax.swing.JOptionPane;

public class LlenarArreglo {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
     int nElemento;

     nElemento = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

     char[] letra = new char[nElemento]; //Creacion de arreglo tipo char

     //pedir elementos para llenar el arreglo
     System.out.println("Digite los elementos del arreglo");


     //Bucle for para pedir al usuario los elementos
     for(int i = 0; i  < nElemento; i++) {
      System.out.println((i+1)+ " Digite un caracter: "); //(i+1) para que el usuario pueda ver el conteo desde 1 y no inicie en 0
      letra[i] = entrada.next().charAt(0); // guardar los caracter que se va digitando. se guardara dentro de letras 
      //El iterador (i) que esta entro de letras[i] es para que los caracteres se guarden en posiciones o indices diferentes
     }

     //otro bucle para mostrar todos los caracteres
     System.out.println("\n Los caracteres del arreglo son: ");

     for(int i = 0; i  < nElemento; i++) {
      System.out.println(letra[i]);
     }

     entrada.close(); 
  }
}
