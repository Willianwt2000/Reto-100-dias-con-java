import javax.swing.JOptionPane;

public class CondicionalesMultiples {
  public static void main(String[] args) {
    int dato;

    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));

    switch (dato) {
      case 1:
        JOptionPane.showMessageDialog(null, "Es el numero: "+dato);
        break;
      case 2:
        JOptionPane.showMessageDialog(null, "Es el numero: "+dato);
      break;
      case 3:
        JOptionPane.showMessageDialog(null, "Es el numero: "+dato);
      break;
    
      case 4:
        JOptionPane.showMessageDialog(null, "Es el numero: "+dato);
      break;
    
      case 5:
        JOptionPane.showMessageDialog(null, "Es el numero: "+dato);
      break;
    
      default:
        JOptionPane.showMessageDialog(null,"El numero no disponible.");
        break;
    }

  }
}
