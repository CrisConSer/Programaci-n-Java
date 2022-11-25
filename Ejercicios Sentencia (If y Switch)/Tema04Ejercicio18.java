import java.util.Scanner;

/*Tema04Ejercicio18.java
* Programa que indica cual es la cifra de un número entero introducido por teclado
* @CConde
*/

public class Tema04Ejercicio18 {
public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduce un número positivo como máximo de 5 cifras: ");
    int n=s.nextInt();
    System.out.println("Indica cuantas cifras tiene el número introducido.");
    System.out.println("Opcion 1. Tiene 2 cifras");
    System.out.println("Opcion 2. Tiene 3 cifras");
    System.out.println("Opcion 3. Tiene 4 cifras");
    System.out.println("Opcion 4. Tiene 5 cifras");
    System.out.print("Nº cifras: ");
    
    int opcion=s.nextInt();
    
    switch (opcion){
    case 1:
        System.out.println("La primera cifra del número " + n + " es " + (n/10));
    break;
    
    case 2:
        System.out.println("La primera cifra del número " + n + " es " + (n/100));
    break;
    
    case 3:
        System.out.println("La primera cifra del número " + n + " es " + (n/1000));
    break;
    
    case 4:
        System.out.println("La primera cifra del número " + n + " es " + (n/10000));
    break;
    
    default:
    }
}
}
