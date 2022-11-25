import java.util.Scanner;

/*Tema04Ejercicio11.java
* Programa que indique los segundos que falta para la media noche desde una hora introducida por máquina
* @CConde
*/



public class Tema04Ejercicio11 {

public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.println("Introduce una hora entre las 1 y las 24 horas");
    System.out.print("Hora:");
    int hora = s.nextInt(); 
    
    System.out.print("Ahora deberás de introducir los minutos entre 01 y 59 ");
    System.out.print("Minutos:");
    int minutos=s.nextInt();

    int segundosTotales = (hora * 3600) + (minutos * 60);
    int segundosMediaNoche = (24 * 3600) - segundosTotales;
            
    System.out.printf("Faltan " + segundosMediaNoche + " segundos " + "para que sea medianoche ");
}
}
