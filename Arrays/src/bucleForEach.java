public class bucleForEach {
  public static void main(String[] args) {
    String[] nombre = {"Willian","Yenifer","Amanda","Heather","Carlos","Adrian","manuel","yesica","gabriel"};

    //bucle for
    /*for(int i = 0; i  < nombre.length; i++) { //metodo length te devuelve la longitud de tu arreglo en un numero entero
      System.out.println(nombre[i]);
     }*/


     //Bucle foreach o bucle for mejorado

     for(String i :nombre) {
      System.out.println("Nombre: "+i);
     }
  }
}



