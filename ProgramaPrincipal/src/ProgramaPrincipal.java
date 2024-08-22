import javax.swing.*;

public class ProgramaPrincipal {
  // Metodo principal
  public static void main(String[] args) {
    String cadena;
    char letra;
    int entero;
    double decimal;

    cadena = JOptionPane.showInputDialog("Digite una cadena: ");
    entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: ")); //transformar a entero
    letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0); //transformar a char
    decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: ")); //Transformar a tipo de dato double

    //Mostrar todos los datos pedidos
    JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
    JOptionPane.showMessageDialog(null, "El entero es: "+entero);
    JOptionPane.showMessageDialog(null, "La letra es: "+letra);
    JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);

  }
}

