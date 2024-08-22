import javax.swing.JOptionPane;

public class Ejercicio_3 {
  /*
   * ? Bloque: Arreglo
   * Ejercicio 3:
   * Leer 5 numeros por tec;ado, almacenarlo en un arreglo y a contnuacion
   * realizar la media de los numeros positivos,
   * la media de los negativos y contar el numero de ceros.
   */
  public static void main(String[] args) {
    int numeros[] = new int[5], sumaTotal = 0, sumaTotalNegativo = 0, cantidad_0 = 0;
    boolean cerosEncontrados = false;
    float promedioPositivo, PromedioNegativo;

    System.out.println("Guardando datos...");
    for (int i = 0; i < 5; i++) {
      numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion " + (i + 1) + " Digite un numero: "));

      if (numeros[i] > 0) {
        sumaTotal += numeros[i];
      } else if (numeros[i] < 0) {
        sumaTotalNegativo += numeros[i];
      } else if (numeros[i] == 0) {
        cerosEncontrados = true;
        cantidad_0++;
      }

    }

    if (sumaTotalNegativo < 0 || sumaTotal > 0) {
      System.out.println("Promedio de los numeros negativos: " + (PromedioNegativo = (float) sumaTotalNegativo / 5));
      System.out.println("Promedio de los numeros positivos: " + (promedioPositivo = (float) sumaTotal / 5));
    }
    if (cerosEncontrados == true) {
      System.out.println("No es posible sacar la media");
      System.out.println("La cantidad de 0 encontrados son: " + cantidad_0);
    } else {
      System.out.println("No se ha encontrado 0 en el arreglo");
    }
  }
}
