import java.util.Scanner;

public class Calificaciones {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int calificaciones = 0;
    boolean estudiantesSupendidos = false;

    for (int i = 1; i <= 5; i++) {
      System.out.println("Digite una calificacion entre el rango 0-10: ");
      calificaciones = entrada.nextInt();

      if (calificaciones > 10 || calificaciones < 0) {
        System.out.println("La calificacion debe estar entre el rango 0-10");
        break;
      }

      if (calificaciones < 3)
        estudiantesSupendidos = true; // si existen estudiantes suspendidos

    }

    if (estudiantesSupendidos == true) {
      System.out.println("existen almenos 1 estudiante suspendido");
    } else {
      System.out.println("No hay estudiantes suspendidos");

    }

    entrada.close();
  }
}
