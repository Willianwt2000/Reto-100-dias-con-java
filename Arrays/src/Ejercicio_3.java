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
    int cantidad_0 = 0,conteoPositivo = 0,conteoNegativo = 0;
    boolean cerosEncontrados = false;
    float numeros[] = new float[5];
    float promedioPositivo, PromedioNegativo, sumaTotal = 0, sumaTotalNegativo = 0;

    System.out.println("Guardando datos...");
    for (int i = 0; i < 5; i++) {
      numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion " + (i + 1) + " Digite un numero: "));

      if (numeros[i] > 0) {
        sumaTotal += numeros[i];
        conteoPositivo++;
      } else if (numeros[i] < 0) {
        sumaTotalNegativo += numeros[i];
        conteoNegativo++;
      } else if (numeros[i] == 0) {
        cerosEncontrados = true;
        cantidad_0++;
      }

    }

    //Media de los numeros positivos negativos y el total de 0
    if (sumaTotal == 0) {
      System.out.println("No se puede sacar el promedio de los numeros positivos");
    } else {
      promedioPositivo = sumaTotal / conteoPositivo;
      System.out.println("Promedio de los numeros positivos: "+promedioPositivo);
    }

    if (sumaTotalNegativo == 0) {
      System.out.println("No se puede sacar el promedio de los numeros negativos");
    } else {
      System.out.println("Promedio de los numeros negativos: " + (PromedioNegativo = sumaTotalNegativo / conteoNegativo));
    }

    if (cerosEncontrados == false) {
      System.out.println("No se ha encontrado 0 en el arreglo");;
    } else {
      System.out.println("La cantidad de 0 encontrados son: " + cantidad_0);
    }
  }
}
