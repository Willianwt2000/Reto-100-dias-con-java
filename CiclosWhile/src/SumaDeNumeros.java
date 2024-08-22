import javax.swing.JOptionPane;

public class SumaDeNumeros {
  public static void main(String[] args) {
    int num,totalSuma = 0;

    num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero: "));

    while (num != 0) {
      totalSuma += num;
      num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite otro numero: "));

      if (num == 0) JOptionPane.showMessageDialog(null, "La suma total es de: "+ totalSuma);
    }

    JOptionPane.showMessageDialog(null, "Proceso finalizado... ");


  }
}
