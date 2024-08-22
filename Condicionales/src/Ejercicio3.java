import javax.swing.JOptionPane;

public class Ejercicio3 {
  public static void main(String[] args) {
    char letra;

    letra  = JOptionPane.showInputDialog(null, "Digite una letra: ").charAt(0);

    if (Character.isUpperCase(letra)) {
      JOptionPane.showConfirmDialog(null, "La letra: __"+ letra+ "__ Es mayuscula");
    } else {
      JOptionPane.showConfirmDialog(null, "La letra: __"+ letra+ "__ Es minuscula");

    }
  }
}
