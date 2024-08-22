import javax.swing.JOptionPane;

public class sueldo {
  public static void main(String[] args) {

    int sueldos = 0, sumaTotal = 0, mayoresDeMil = 0;

    for (int i = 1; i <= 10; i++) {
      
      sueldos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un sueldo: "));

      if (sueldos > 1000) {
        mayoresDeMil++;
      }

      sumaTotal += sueldos;
      
    }

    JOptionPane.showMessageDialog(null, "La suma de los sueldos es: $" + sumaTotal);
    JOptionPane.showMessageDialog(null, "Las cantidades de sueldos  mayores a $1000 son: " + mayoresDeMil);
  }
}
