import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {

    Scanner entradas = new Scanner(System.in);
    float calificacion1,calificacion2,calificacion3,suma;
  
    
    //? Guardamos las 3 notas
    System.out.println("Digite las 3 calificacion: ");
    calificacion1 = entradas.nextFloat();
    calificacion2 = entradas.nextFloat();
    calificacion3 = entradas.nextFloat();


    suma = calificacion1+calificacion2+calificacion3;

    System.out.println(" \nEl resultado de las 3 calificaciones es: "+suma);
  }

}
