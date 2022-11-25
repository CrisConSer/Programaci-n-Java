import java.util.Scanner;

/*Tema04Ejercicio17.java
* Programa que indica cual es la cifra de un número entero introducido por teclado
* @CConde
*/

public class Tema04Ejercicio17 {
public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.print("Introduce un número: ");
    int numero =s.nextInt();
    int total;
    total=numero%10;
    
    System.out.println("La última cifra del número " + numero + " es el " + total + ".");
}
}