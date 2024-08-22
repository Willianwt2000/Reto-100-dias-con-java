import java.util.Scanner;

import javax.swing.JOptionPane;

public class DiasMesAnios {
  public static void main(String[] args) {
    int dia, mes ,anios;

    //Leer fecha
    dia = Integer.parseInt(JOptionPane.showInputDialog(null, "DIgite el dia: "));
    mes = Integer.parseInt(JOptionPane.showInputDialog(null, "DIgite el mes: "));
    anios = Integer.parseInt(JOptionPane.showInputDialog(null, "DIgite el año: "));

    //Logica para condicionar
    if ((dia >= 1) && (dia <= 30)) { //si el dia es correcto

    if (dia >= 1 &&  mes <= 12) { //si el mes es correcto

      if (anios != 0) { //Si el año es correcto
        JOptionPane.showMessageDialog(null, "Fecha correcta");
      } else {
        JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
      }


      JOptionPane.showMessageDialog(null, "La fecha es correcta: "+dia+ "/"+mes+"/"+anios);
    } else {
      JOptionPane.showMessageDialog(null, "Error! la fecha es Incorrecta, mes incorrecto");
    }
    } else {
      JOptionPane.showMessageDialog(null, "Error! la fecha es Incorrecta, dia incorrecto");
    }

  }
}
