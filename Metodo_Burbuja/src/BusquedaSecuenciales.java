/*Busqueda secuencial ----- arreglo[] = {1,5,6,2,7,8}; dato = 2 */

import javax.swing.JOptionPane;

public class BusquedaSecuenciales {
  public static void main(String[] args) {
    int tabla[] = {1,5,6,2,7,8};
    int dato; 
    boolean datoEncontrado = false;

    dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero a buscar: "));

    //Busqueda secuencial=== Algoritmo de la busqueda secuencial
    int i = 0;
  
    while (i < tabla.length && datoEncontrado == false) { //Mientras no se recorra todo el arreglo y el dato encontrado sea igual a false osea que no se halla encontrado el numero digitado.
      if (tabla[i] == dato) {
        datoEncontrado = true;
      }
      
      i++;
    }

    if (datoEncontrado == false) {
      JOptionPane.showMessageDialog(null,"El numero no se encuentra en la tabla.");
    }
    else {
      JOptionPane.showMessageDialog(null,"El numero: " + dato +" se encuentra en la posicion: "+(i-1)+ " de la tabla");
    }

  }
}
