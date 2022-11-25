import java.util.Scanner;

/*Tema04Ejercicio14.java
* Programa que indica si un numero introducido por teclado es par y/o divisible entre5
* @CConde
*/



public class Tema04Ejercicio14 {
public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduce un número: ");
    int numero=s.nextInt();

    
    if (numero%2==0){
    System.out.println("El número " + numero + " es un numero par.");
    } else {
    System.out.println("El número introducido es un número impar.");
    }
    if (numero%5==0){
    System.out.println("El número " + numero + " es un número divisible entre 5.");
    } else {
    System.out.println("El número " + numero + " es un número no divible entre 5.");
    }
}
}