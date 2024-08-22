import javax.swing.JOptionPane;

public class AdivinarNumero {
  public static void main(String[] args) {
    int num,numSecreto,contadorIntentos;

    //Esto es para generar un numero aleatorio entre 0 y 100
    //int min = 0;
    //int max = 100;

    contadorIntentos = 1; // inicializar contador de intentos

    // Generar un número aleatorio entre min (inclusive) y max (exclusive)
    numSecreto = (int)  (Math.random()*100);  //(Math.random() * (max - min)) + min;
    System.out.println("Numero secreto "+numSecreto);

    //Pedir numero al usuario
    num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero secreto"));

    while (numSecreto != num) {
      if (numSecreto > num) {
        JOptionPane.showMessageDialog(null,"Ups! digite un numero mayor");
      } else {
        JOptionPane.showMessageDialog(null,"Ups! digite un  numero menor");

      } 
      num = Integer.parseInt(JOptionPane.showInputDialog(null, "Intente de nuevo"));
      contadorIntentos++;
      
    }
    if (numSecreto == num) JOptionPane.showMessageDialog(null,"Felicidades! Usted ha hacertado\n "+ contadorIntentos + " intentos");
    JOptionPane.showMessageDialog(null,"Proceso finalizado...");
  }
}
