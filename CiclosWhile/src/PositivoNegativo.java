import javax.swing.JOptionPane;

public class PositivoNegativo {
  public static void main(String[] args) {
    int num,numPositivo,numNegativo;

    numPositivo = 0;
    numNegativo = 0;
    num = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite un numero: "));
    
    while (num != 0) {
     if (num > 0) {
      numPositivo++;
     } else if (num < 0) {
      numNegativo++;
     }
     num = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite otro numero: "));
    }

    JOptionPane.showMessageDialog(null, "La cantidad de numeros positivos digitados es: "+numPositivo 
    + "\n y la cantidad de numeros negativos digitado es: "+numNegativo);

    JOptionPane.showMessageDialog(null, "Proceso finalizado...");   
  }
}
