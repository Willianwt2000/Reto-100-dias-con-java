import java.util.Scanner;

public class Ejercicio_16 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);


    int primerGrupo[] = new int[5];
    int segundoGrupo[] = new int[5];
    int tercerGrupo[] = new int[5];

    int sumaPrimerGrupo = 0, sumaSegundoGrupo = 0, sumaTercerGrupo = 0;
    float mediaPrimerGrupo, mediaSegundoGrupo, mediaTercerGrupo;
    int nPosicion;

    // Solicitar notas para el primer grupo
    System.out.println("Ingrese las notas del primer grupo:");
    for (int i = 0; i < 5; i++) {
      System.out.print("Nota del alumno " + (i + 1) + ": ");
      primerGrupo[i] = entrada.nextInt();
      sumaPrimerGrupo += primerGrupo[i];
    }

    // Solicitar notas para el segundo grupo
    System.out.println("Ingrese las notas del segundo grupo:");
    for (int i = 0; i < 5; i++) {
      System.out.print("Nota del alumno " + (i + 1) + ": ");
      segundoGrupo[i] = entrada.nextInt();
      sumaSegundoGrupo += segundoGrupo[i];
    }

    // Solicitar notas para el tercer grupo
    System.out.println("Ingrese las notas del tercer grupo:");
    for (int i = 0; i < 5; i++) {
      System.out.print("Nota del alumno " + (i + 1) + ": ");
      tercerGrupo[i] = entrada.nextInt();
      sumaTercerGrupo += tercerGrupo[i];
    }

    // Calcular las medias de los grupos
    mediaPrimerGrupo = (float) sumaPrimerGrupo / 5;
    mediaSegundoGrupo = (float) sumaSegundoGrupo / 5;
    mediaTercerGrupo = (float) sumaTercerGrupo / 5;

    // Mostrar las medias de los grupos
    System.out.println("La media del primer grupo es: " + mediaPrimerGrupo);
    System.out.println("La media del segundo grupo es: " + mediaSegundoGrupo);
    System.out.println("La media del tercer grupo es: " + mediaTercerGrupo);

    // Ingresar posición del alumno y calcular su media
    System.out.println("Ingrese la posición del alumno (1-5):");
    nPosicion = entrada.nextInt() - 1;

    if (nPosicion >= 0 && nPosicion < 5) {
      float mediaAlumnoPrimerGrupo = primerGrupo[nPosicion];
      float mediaAlumnoSegundoGrupo = segundoGrupo[nPosicion];
      float mediaAlumnoTercerGrupo = tercerGrupo[nPosicion];

      System.out.println(
          "La nota del alumno en la posición " + (nPosicion + 1) + " en el primer grupo es: " + mediaAlumnoPrimerGrupo);
      System.out.println("La nota del alumno en la posición " + (nPosicion + 1) + " en el segundo grupo es: "
          + mediaAlumnoSegundoGrupo);
      System.out.println(
          "La nota del alumno en la posición " + (nPosicion + 1) + " en el tercer grupo es: " + mediaAlumnoTercerGrupo);
    } else {
      System.out.println("Posición inválida. Debe ser un número entre 1 y 5.");
    }

    entrada.close();
  }
}
