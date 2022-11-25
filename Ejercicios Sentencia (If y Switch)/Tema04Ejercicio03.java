import java.util.Scanner;

/*Tema04Ejercicio03.java
* Programa que en que dado un número del 1 a 7 escriba el 
*correspondiente nombre del día de la semana
* @CConde
*/

public class Tema04Ejercicio03 {
public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Por favor, introduzca un numero de dia de la semana: ");
    
    int dia=s.nextInt();
    String diaSemana;
    
    switch(dia) {
    case 1:
    diaSemana = "Lunes";
    break;
    case 2:
    diaSemana = "Martes";
    break;
    case 3:
    diaSemana = "Miercoles";
    break;
    case 4:
    diaSemana = "Jueves";
    break;
    case 5:
    diaSemana = "Viernes";
    break;
    case 6:
    diaSemana = "Sabado";
    break;
    case 7:
    diaSemana = "Domingo";
    break;
    default:
        diaSemana = "No existe ese dia";
    }
    
    System.out.println( "Dia " + dia + ": " + diaSemana);
    
}
}
