import javax.swing.JOptionPane;

public class TrabajoSemanal {
  public static void main(String[] args) {
    int horasTrabajadas, pagos;

    horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite las horas trabajadas"));

    if (horasTrabajadas <= 40) {
      pagos = horasTrabajadas * 16;
      
      JOptionPane.showMessageDialog(null, "Su pago semanal es de: $"+pagos);
    } else if (horasTrabajadas > 40) {
      pagos = (horasTrabajadas *16);

     
      pagos = (40*16) + ((horasTrabajadas - 40) * 20);
      JOptionPane.showMessageDialog(null, "Su pago semanal es de: $"+pagos);
    }
  }
}
