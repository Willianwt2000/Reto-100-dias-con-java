import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner entradas = new Scanner(System.in);

    //? Definiendo las variables.
    String nombre;

    float participacion, primerExamen,segundoExamen,tercerExame;
    float porcientoParticipacion,porcentajePrimerEX,porcentajeSegunEX,porcentajeTerceExm;
    float calificacionFinal;


    //Entradas de las 4 calificaciones del estudiante
    System.out.println("Ingrese su nombre: ");
    nombre = entradas.nextLine();

    //Pedir notas, como dato de entrada
    System.out.println("Hola " +nombre +" Digite la nota de participacion");
    participacion = entradas.nextFloat();
    System.out.println("Digite la nota del primer examen parcial");
    primerExamen = entradas.nextFloat();
    System.out.println("Digite la nota del segundo examen parcial");
    segundoExamen = entradas.nextFloat();
    System.out.println("Digite la nota del tercer examen parcial");
    tercerExame = entradas.nextFloat();

    //Sacamos los calculos
    porcientoParticipacion = (float) (participacion * 0.10f);
    porcentajePrimerEX = (float) (primerExamen * 0.25f);
    porcentajeSegunEX = (float) (segundoExamen * 0.25f);
    porcentajeTerceExm = (float) (tercerExame * 0.40f);


    System.out.println(porcientoParticipacion);
    System.out.println(porcentajePrimerEX);
    System.out.println(porcentajeSegunEX);
    System.out.println(porcentajeTerceExm);
    

    //Suma de las calificaciones
    calificacionFinal = porcientoParticipacion + porcentajePrimerEX + porcentajeSegunEX + porcentajeTerceExm;

    System.out.println(nombre + " Su Nota final es de: "+ calificacionFinal + "% ");

  }
}
