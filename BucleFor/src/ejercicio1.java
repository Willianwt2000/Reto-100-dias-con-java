//import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio1 {
  public static void main(String[] args) {
    //Scanner entrada = new Scanner(System.in);
    int num,cuadrado;

  /*   do {
      System.out.println("Digite un numero: ");
      num = entrada.nextInt();

      cuadrado = (num * num);
      
      System.out.println("El cuadrado de: "+ num + " es = "+ cuadrado);

      if (num < 0) System.out.println("Fin del proceso...");
    } while (num >= 0);*/

    //? Tambien se puede realizar de esta forma el ejercicio

    num =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));
    while (num >= 0) {
      cuadrado = (int) Math.pow(num, 2); // para determinar su cuadrado

      JOptionPane.showMessageDialog(null, "El cuadrado de: "+ num + " es = "+ cuadrado);

      num =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero"));

      if (num < 0) JOptionPane.showMessageDialog(null, "Fin del proceso...");
    }


    //entrada.close();
  }
}
