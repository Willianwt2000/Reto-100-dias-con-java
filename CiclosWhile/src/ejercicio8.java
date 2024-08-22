import java.util.Scanner;

//import javax.swing.JOptionPane;

public class ejercicio8 {
  public static void main(String[] args) {
    Scanner entradas = new Scanner(System.in);
    int n;

    //n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero: "));
    System.out.println("Digite un numero: ");
    n = entradas.nextInt();

    for (int i =1; i <= n; i++) {
      //JOptionPane.showMessageDialog(null,i);
      System.out.println(i);
    }

    entradas.close();
  }
}
