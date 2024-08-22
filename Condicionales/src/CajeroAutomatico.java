import javax.swing.JOptionPane;

public class CajeroAutomatico {
  /**
   * @param args
   */
  public static void main(String[] args) {
    final int saldo = 1000;
    int opciones;
    float depositar, retiro, saldoAcual;

    opciones = Integer
        .parseInt(JOptionPane.showInputDialog(null, "Digite la opcion deseada:\n1-Depositar\n2-Retirar\n3-Retirar"));

    switch (opciones) {

      case 1:
        depositar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad a Depositar"));
        if (depositar <= 0)
          JOptionPane.showMessageDialog(null, "Valor no permitido");
        if (depositar > 0) {
          saldoAcual = saldo + depositar;
          JOptionPane.showMessageDialog(null, "Deposito realizado con exito!\nSu saldo es de: $" + saldoAcual);
        }
        break;

      case 2:
        retiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor a retirar: "));

        if (retiro <= 0) {
          JOptionPane.showMessageDialog(null, "Valor no permitido");

        } else if (retiro == saldo) {
          JOptionPane.showMessageDialog(null, "No se permite retirar todo su monto");
        } else if (retiro > saldo) {
          JOptionPane.showMessageDialog(null, "Usted no tiene sufiente saldo para hacer ese retiro.");
        } else {
          if (retiro < saldo) {
            saldoAcual = saldo - retiro;
            JOptionPane.showMessageDialog(null, "Su saldo principar es de: $" + saldoAcual);
          }
        }
        break;

      case 3:
        JOptionPane.showMessageDialog(null, "SALIR");
        break;
      default:
        JOptionPane.showMessageDialog(null, "OPCION INVALIDA!");
        break;
    }

  }
}
