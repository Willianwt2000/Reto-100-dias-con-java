import java.util.Scanner;

import javax.swing.JOptionPane;

public class AlumnosAprobados {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    String nombre;
    int notas,aprobados = 0,condicionado = 0,suspensos = 0;

    for (int i = 1; i <= 6; i++) {
      nombre = JOptionPane.showInputDialog(null, "Digite el nombre del estudiante : ");
      notas = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor digite la nota del estudiante " + nombre));

      if (notas > 10 || notas < 0) {
        System.out.println("Lo sentimos la nota introducida no es valida!");
        break;
      } else {
        if (notas > 4) {
          aprobados++;
          System.out.println(nombre + " estado aprobado");
        } else if (notas < 4) {
          suspensos++;
          System.out.println(nombre + " estado suspendido");
        } else if (notas == 4) {
          condicionado++;
          System.out.println(nombre + " estado condicionado");
        }
      }

    }

    System.out.println("Cantidad de estudiantes aprobados: "+aprobados);
    System.out.println("Cantidad de estudiantes condicionados: "+condicionado);
    System.out.println("Cantidad de estudiantes suspensos: "+suspensos);
    entrada.close();
  }
}
