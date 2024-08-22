import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner entradas = new Scanner(System.in);

    //Declracion de variables
    int horasTotales,semanas, dias, horas;

    //Inicializar semana
    semanas = 0;
    dias = 0;
    horas = 0;
    //Entradas de datos
    System.out.println("Digite las horas: ");
    horasTotales = entradas.nextInt();

    //Calculo,Semanas, dias y horas
    semanas = horasTotales / 168;
    dias = horasTotales % 168 / 24;
    horas = horasTotales%24;



    System.out.println("EL equivalente es: "+semanas+ " semanas "+dias + " dias. "+ " y "+horas + " horas");

  }
}
