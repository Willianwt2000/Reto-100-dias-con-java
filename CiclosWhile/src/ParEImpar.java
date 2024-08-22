import javax.swing.JOptionPane;

public class ParEImpar {
  public static void main(String[] args) {
    int num,numPar,numImpar;

    numPar = 0;
    numImpar = 0;
    num = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite un numero: "));
    
    while (num != 0) {
     if (num % 2 == 0) {
       JOptionPane.showMessageDialog(null, " Numero Par: "+num);
       numPar++;
     } else if (num % 2 == 1) {
       JOptionPane.showMessageDialog(null, " Numero Impar: "+num);
      numImpar++;
     }
     num = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite otro numero: "));
    }

    JOptionPane.showMessageDialog(null, "La cantidad de numeros PAR digitados es: "+numPar 
    + "\n y la cantidad de numeros IMPAR digitado es: "+numImpar);

    JOptionPane.showMessageDialog(null, "Proceso finalizado...");   
  }
}
