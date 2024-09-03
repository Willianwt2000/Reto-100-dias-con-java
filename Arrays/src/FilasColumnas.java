import java.util.Scanner;

public class FilasColumnas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int filas,columnas,contador = 0;
    System.out.println("Digite la cantidad de filas: ");
    filas = entrada.nextInt();
    System.out.println("Digite la canidad de columnas: ");
    columnas = entrada.nextInt();
    
    int numeros[][] = new int[filas][columnas]; 

    for(int i = 0; i < filas; i++) {
      for(int j = 0; j < columnas; j++) {
      numeros[i][j] = contador;

      contador++;
      System.out.print("["+numeros[i][j]+"]");
       
      }
      System.out.println("");
    }

    
   entrada.close();
  }
}
