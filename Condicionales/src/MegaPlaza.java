import javax.swing.JOptionPane;

public class MegaPlaza {
  public static void main(String[] args) {
    float megaPlaza, descuento;
    megaPlaza = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la el monto a pagar: "));
    String texto = "  Su monto a pagar es de: $" + megaPlaza + " con un descuento de un 20% ";

    if (megaPlaza <= 300) {
      JOptionPane.showMessageDialog(null, "Su monto a pagar es de: $" + megaPlaza);
    } else {
      descuento = megaPlaza - (0.20f * megaPlaza);
      JOptionPane.showMessageDialog(null, texto + descuento);
    }
  }
}
