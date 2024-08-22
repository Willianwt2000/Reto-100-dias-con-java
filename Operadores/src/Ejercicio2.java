import java.util.Scanner;

/*? Hacer un programa que calculé e imprima el salario semanal de un empleado
 a partir de sus horas semanales trabajadas y de su salario por hora
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);

        double horasTrabajadas,salarioPorHoras, salarioSemanal;
        

        System.out.println("Ingrese Las Horas trabajadas Y el salario: ");
        horasTrabajadas = entradas.nextDouble();
        salarioPorHoras = entradas.nextDouble();

        salarioSemanal = horasTrabajadas*salarioPorHoras;

        System.out.println("\nSu salario semanal es de: $"+salarioSemanal);


    }
}
