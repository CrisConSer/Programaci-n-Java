import java.util.Scanner;

/*Tema04Ejercicio15.java
* Programa que imprime una piramide con la punta hacia donde le indiquemos
* @CConde
*/



public class Tema04Ejercicio15 {
public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.println("Con este programa vamos a dibujar una pirámide con el carácter seleccionado");
    System.out.print("Seleccione un carácter: ");
    String n=s.next();
    System.out.println("Elige una de las siguientes opciones:");
    System.out.println("Opción 1. Vértice hacia arriba");
    System.out.println("Opción 2. Vértice hacia derecha");
    System.out.println("Opción 3. Vértice hacia abajo");
    System.out.println("Opción 4. Vértice hacia izquierda");
    
    int opcion = s.nextInt();
        
    switch (opcion){
    case 1:
        System.out.println("   " + n + "   ");
        System.out.println("  " + n+n+n + "  ");
        System.out.println(" " + n+n+n+n+n + " ");
        break;
        
    case 2:
        System.out.println(" " + n+n+n + "  ");
        System.out.println("  " +n+n+n+n+ "  ");
        System.out.println(" " + n+n+n + "  ");
        break;
        
    case 3:
        System.out.println(" " + n+n+n+n+n + " ");
        System.out.println("  " + n+n+n + "   ");
        System.out.println("   " + n + "    ");
        break;
        
    case 4:
        System.out.println("  " + n+n+n + "   ");
        System.out.println(" " + n+n+n+n + "   ");
        System.out.println("  " + n+n+n + "   ");
        break;
        
    default:      
    }
}
}
    