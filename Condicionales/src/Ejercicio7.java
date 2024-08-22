import javax.swing.JOptionPane;

public class Ejercicio7 {
  public static void main(String[] args) {
    int a, b, c;
    double x1, x2;

    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de A: "));
    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de B: "));
    c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de C: "));

    double discriminante = b * b - 4 * a * c;

    if (discriminante > 0) {
        x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        JOptionPane.showMessageDialog(null, "Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
    } else if (discriminante == 0) {
        x1 = -b / (2 * a);
        JOptionPane.showMessageDialog(null, "La solución doble es: x = " + x1);
    } else {
        JOptionPane.showMessageDialog(null, "La ecuación no tiene soluciones reales.");
    }
  }
}
