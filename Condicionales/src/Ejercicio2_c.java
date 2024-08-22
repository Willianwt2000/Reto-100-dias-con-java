import javax.swing.JOptionPane;

public class Ejercicio2_c {
  public static void main(String[] args) {
    int num1,num2;

    num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el primer numero: "));
    num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el segundo numero: "));

    if (num1 > num2) {
      JOptionPane.showMessageDialog(null, " El numero: "+num1+ " Es mayor a: "+num2);
    }else if (num1 < num2) {
      JOptionPane.showMessageDialog(null, " El numero: "+num2+ " Es mayor a: "+num1);
    } else {
      JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
    }
  }
}
