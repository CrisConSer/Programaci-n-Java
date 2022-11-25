import java.util.Scanner;

/*Tema04Ejercicio01.java
* Programa que en que dado un número del 1 a 7 escriba el 
*correspondiente nombre del día de la semana
* @CConde
*/

public class Tema04Ejercicio01 {
public static void main(String[] args) {
    
    Scanner s= new Scanner (System.in);

    System.out.println("Por favor, introduzca un dia de la semana: ");
    System.out.println("1. Lunes");
    System.out.println("2. Martes");
    System.out.println("3. Miercoles");
    System.out.println("4. Jueves");
    System.out.println("5. Viernes");

    int dia = s.nextInt();
    String materia="";
    
    
    switch (dia) {
    case 1:
        materia = "Lengua";
    break;
    
    case 2:
        materia = "Ingles";
    break;
    
    case 3:
        materia = "Fisica";
    break;
    
    case 4:
        materia = "Quimica";
    break;
    
    case 5:
        materia = "Historia";
    break;
    
    default:
        materia="La opcion elegida no es correcta";
    }
    
    System.out.println("El " + dia + " a primera hora hay: " + materia);
}
}
