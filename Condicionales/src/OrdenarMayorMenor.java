import javax.swing.JOptionPane;

public class OrdenarMayorMenor {
  public static void main(String[] args) {
    int num1, num2, num3;

    
    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer numero: "));
    num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo numero: "));
    num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tercer numero: "));

    if ((num1 > num2) && (num2 > num3)) {
      JOptionPane.showMessageDialog(null, "Orden: " + num1 + " - " + num2 + " - " + num3);
    } else if ((num1 > num3) && (num3>num2)) {
      JOptionPane.showMessageDialog(null, "Orden: " + num1 + " - " + num3 + " - " + num2);
    } else if ((num2> num1)&&(num1 > num3)) {
      JOptionPane.showMessageDialog(null, "Orden: " + num2 + " - " + num1 + " - " + num3);
    } else if ((num2 > num3) && (num3 > num1)) {
      JOptionPane.showMessageDialog(null, "Orden: " + num2 + " - " + num3 + " - " + num1);
    } else if ((num3 > num1) && (num1 > num2)) {
      JOptionPane.showMessageDialog(null, "Orden: " + num3 + " - " + num1 + " - " + num2);
    } else {
      JOptionPane.showMessageDialog(null, "Orden: " + num3 + " - " + num2 + " - " + num1);
    }
  }
}
