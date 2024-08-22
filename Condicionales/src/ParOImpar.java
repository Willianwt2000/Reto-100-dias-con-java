import javax.swing.JOptionPane;

public class ParOImpar {
    public static void main(String[] args) {
        int num1,num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el segundo numero"));

        if (num1 % 2 == 0 & num2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos numeros son Par");
        } else {
            JOptionPane.showMessageDialog(null, "Un numero o Ambos numeros son Impar");

        }
    }
}
