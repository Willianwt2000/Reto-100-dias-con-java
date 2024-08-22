import javax.swing.JOptionPane;

public class UnidadDeMasa {
  public static void main(String[] args) {
    /* 
     ? Sistema Internacional (SI)
     * 1-Kilogramo (kg): Unidad base del Sistema Internacional de Unidades (SI). Es la unidad principal para medir masa.
     * 2-Gramo (g): 1 kilogramo equivale a 1,000 gramos.
     * 3-Miligramo (mg): 1 gramo equivale a 1,000 miligramos.
     * 4-Microgramo (µg): 1 miligramo equivale a 1,000 microgramos.
     * 5-Libra: lb
     * 6-Onza: oz
     */

     float kg,g,mg,lb,oz;
  

     kg = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidade de KG que desea convertir: "));



     if (kg > 0) { //condicion para evitar que el numero no sea negativo

      int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Unidades de medidas de masa\nPor favor seleccione la medida a la cual " +
      "desea convertir el KG\n" 
      +"1-GRAMOS (G)\n"
      +"2-MILIGRAMOS (MG)\n"
      +"3-LIBRA (LB)\n"
      +"4-ONZA (OZ)"));

      switch (opcion) {
        case 1:
          g = kg*1000;
          JOptionPane.showMessageDialog(null,   kg+"kg"+ " = "+g+"g");
          break;
        case 2:
          mg = (kg*1000000);
          JOptionPane.showMessageDialog(null,   kg+"kg"+ " = "+mg+"mg");
          break;
      
        case 3:
          lb = (kg*2.20462f);
          JOptionPane.showMessageDialog(null,   kg+"kg"+ " = "+lb+"lb");
          break;
        case 4:
          oz = (kg*35.274f);
          JOptionPane.showMessageDialog(null,   kg+"kg"+ " = "+oz+"oz");
          break;
      
        default:
          break;
      }
     } else {
      JOptionPane.showMessageDialog(null, "Las unidades de medida no pueden ser negativas.");
     }

  }
}
