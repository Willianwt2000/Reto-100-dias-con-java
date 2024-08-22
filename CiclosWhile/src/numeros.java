import javax.swing.JOptionPane;

public class numeros {
  public static void main(String[] args) {
    int num,contadorNum = 0;
    num = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite un numero"));

    while (num > 0) {
      num = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite otro numero"));
      contadorNum++;
      if (num < 0)     JOptionPane.showMessageDialog(null,"Se ha digitado "+contadorNum + " numeros");
    }
    
    JOptionPane.showMessageDialog(null,"Proceso finalizado...");
  }
}
