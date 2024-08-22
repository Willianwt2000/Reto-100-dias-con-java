import javax.swing.JOptionPane;

public class DatosAlumnos {
  public static void main(String[] args) {
    int edades,mayoresDE_18 = 0,conteoEstaturas = 0 ,sumaEdades = 0,conteoGeneral;
    float estatura,mediaEdad = 0,mediaEstatura = 0,sumaEstaturas = 0;

    //seleccion de cuanto estudiantes desea el usuario
    conteoGeneral = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad a agregar: "));
    for(int i = 1; i <= conteoGeneral; i++) {
      edades = Integer.parseInt(JOptionPane.showInputDialog(null, "Alumno "+ i +"\nDigite edad edad:"));
      estatura = Float.parseFloat(JOptionPane.showInputDialog(null, "Alumno "+ i +"\nDigite su estatura:"));

      if (edades > 18) {
        mayoresDE_18 ++; //Incremento de alumnos mayores a 18
      }

      if (estatura > 1.75) {
        conteoEstaturas++; //Incremento de alumnos con estatura mayor a 1.75
      }

        //Suma iterativas de edades y estaturas
        sumaEdades += edades;
        sumaEstaturas += estatura;

        //promedios de estatura y edades
        mediaEdad = (float) sumaEdades / conteoGeneral;
        mediaEstatura = (float) sumaEstaturas / conteoGeneral;
    }
  
    JOptionPane.showMessageDialog(null, "Cantidad de alumnos mayores de 18: " + mayoresDE_18);
    JOptionPane.showMessageDialog(null, "Cantidad de alumnos con estatura mayor a 1.75: " + conteoEstaturas);
    JOptionPane.showMessageDialog(null, "Promedio de edades: " + mediaEdad);
    JOptionPane.showMessageDialog(null, "Promedio de estaturas: " + mediaEstatura);
  }
  
}
