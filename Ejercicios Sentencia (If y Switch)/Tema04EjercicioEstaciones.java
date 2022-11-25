import java.util.Scanner;

/*Tema04EjercicioEstaciones.java
* Programa que ordena tres números enteros introducidos por teclado
* y se orden de menor a mayor
* @CConde
*/

public class Tema04EjercicioEstaciones {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);

        System.out.print("Por favor, introduzca un numero de mes: ");
        int numeroDelMes = s.nextInt();
        String estacion;

        switch (numeroDelMes) {
        case 1:
        case 2:
        case 3:
            estacion = "invierno";
        break;

        case 4:
        case 5:
        case 6:
            estacion = "primavera";
        break;
        
        case 7:
        case 8:
        case 9:
            estacion = "verano";
        break;
        
        case 10:
        case 11:
        case 12:
            estacion = "otoño";
        break;
        

        default:
                estacion = "no existe ese mes";
        }
                
        System.out.println("La estacion correspondiente al mes elegido es " + estacion);
        
    }
}

