import javax.swing.*;

public class notasSobresalientes {
  public static void main(String[] args) {
    int nota;

    nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la nota: "));

    if (nota >= 0) {
      if (nota <= 3) {
        JOptionPane.showMessageDialog(null, "Insuficiente");
      }else if (nota >= 4 && nota <= 6) {
        JOptionPane.showMessageDialog(null, "Suficiente");
      } else if (nota >= 7 && nota <= 8) {
        JOptionPane.showMessageDialog(null, "Bien");
      } else if (nota == 9) {
        JOptionPane.showMessageDialog(null, "Notable");
      } else if (nota == 10) {
        JOptionPane.showMessageDialog(null, "SOBRESALIENTE");
      }
    } else { 
      JOptionPane.showMessageDialog(null, "Nota invalida");
    }
  }
}
