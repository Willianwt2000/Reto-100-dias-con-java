import java.util.Scanner;

public class CalculoPromedio {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int totalSuma,num,conteoNum;
    float promedio;
    
    System.out.println("Digite un numero: ");
    num = entrada.nextInt();
    totalSuma = 0;
    conteoNum = 0;
    promedio = 0;
    while (num >= 0) {
      totalSuma += num;//Suma de todos los valores o sumas iterativas
      conteoNum++; // incrementos de elementos
      System.out.println("Digite otro numero: ");
      num = entrada.nextInt();
    }

    System.out.println(conteoNum);

    if (num == 0) {
      System.out.println("La division entre 0 no existe...");
    } else {
      promedio = (float) totalSuma / conteoNum; //Promedio de todos los valores
      System.out.println("EL promedio de los numeros digitados es: "+promedio);
    }

    System.out.println("Proceso finalizado");
    entrada.close();
  }
}
