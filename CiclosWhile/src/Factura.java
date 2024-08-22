import javax.swing.JOptionPane;

public class Factura {
  public static void main(String[] args) {
    int codigo,litros,litrosArticulo1 = 0,conteoMayor600 = 0;
    float preciosLitros,importeFactura,facturacionTotal = 0;

    for(int i = 1; i <= 5; i++) {
      codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Articulo  N°"+i+"\nDigite el codigo"));
      litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Articulo  N°"+i+"\nDigite la cantidad vendida en litros"));

      preciosLitros = Float.parseFloat(JOptionPane.showInputDialog(null, "Articulo  N°"+i+"\nDigite el precio por litros"));

      importeFactura = (float) litros*preciosLitros;

      facturacionTotal += importeFactura;


      if (codigo == 1) {
        litrosArticulo1 += litros;
      }

      if (importeFactura > 600) {
        conteoMayor600++;
      }
    }


    System.out.println("Resumen de ventas");
    System.out.println("Facturacion total: "+facturacionTotal);
    System.out.println("Cantidad de litros vendidos del articulo 1: "+litrosArticulo1);
    System.out.println("Cantidad de factura mayores a 600: "+conteoMayor600 );

  }
}
