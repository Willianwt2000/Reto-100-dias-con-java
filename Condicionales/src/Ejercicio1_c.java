import javax.swing.JOptionPane;

public class Ejercicio1_c {
  public static void main(String[] args) {
    int dato;

    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));

    if (dato % 10 == 0) {
      JOptionPane.showMessageDialog(null, "El numero: "+dato +" es multiplo de 10.");
    } else {
      JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10.");
    }
  }
}
