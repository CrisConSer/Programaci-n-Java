import java.util.Scanner;

public class Tema04Ejercicio12 {
  public static void main(String[] args) {
    Scanner s= new Scanner (System.in);
    
    System.out.println("Comienza el cuestionario de DAW");    
    System.out.println("¿Qué IDE usamos en Programación actualmente? ");
    System.out.println("A:visual Studio Code");
    System.out.println("B:Geany");
       
    String respuesta1 = s.next();
    String respuesta1Mini= respuesta1.toLowerCase();
    int puntuacion;
    puntuacion=0;
        
    if(respuesta1Mini.equals("b")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿Qué profesor/a imparte la asignatura de Programación? ");
    System.out.println("A:Araceli");
    System.out.println("B:Rafa");
       
    String respuesta2 = s.next();
    String respuesta2Mini= respuesta2.toLowerCase();    
    
    if (respuesta2Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
    System.out.println("¿Qué significa JVM? ");
    System.out.println("A:Juega Virtualmente mucho");
    System.out.println("B:Máquina Virtual de Java");
       
    String respuesta3 = s.next();
    String respuesta3Mini= respuesta3.toLowerCase();    
    
    if (respuesta3Mini.equals("b")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
    
    System.out.println("¿De qué empresa es NeatBeans? ");
    System.out.println("A:Oracle");
    System.out.println("B:Microsoft");
       
    String respuesta4 = s.next();
    String respuesta4Mini= respuesta4.toLowerCase();    
    
    if (respuesta4Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿De cuánto es la identación que se debe de poner en Geany? ");
    System.out.println("A:2");
    System.out.println("B:4");
       
    String respuesta5 = s.next();
    String respuesta5Mini= respuesta5.toLowerCase();    
    
    if (respuesta5Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿Cuál es el primer programa que todo programador debe crear? ");
    System.out.println("A:Hola Universo");
    System.out.println("B:Hola Mundo");
       
    String respuesta6 = s.next();
    String respuesta6Mini= respuesta6.toLowerCase();    
    
    if (respuesta6Mini.equals("b")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿Cuál es la instrucción de la salida formateada? ");
    System.out.println("A:printf()");
    System.out.println("B:println()");
       
    String respuesta7 = s.next();
    String respuesta7Mini= respuesta7.toLowerCase();    
    
    if (respuesta7Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿Cómo se declara una variable de números enteros? ");
    System.out.println("A:float");
    System.out.println("B:int");
       
    String respuesta8 = s.next();
    String respuesta8Mini= respuesta8.toLowerCase();    
    
    if (respuesta8Mini.equals("b")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
      
    System.out.println("¿Cómo se declara una variable de números decimales? ");
    System.out.println("A:double");
    System.out.println("B:int");
       
    String respuesta9 = s.next();
    String respuesta9Mini= respuesta9.toLowerCase();    
    
    if (respuesta9Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
    
    System.out.println("¿Cuál es la variable de una letra suelta? ");
    System.out.println("A:char");
    System.out.println("B:letra");
       
    String respuesta10 = s.next();
    String respuesta10Mini= respuesta10.toLowerCase();    
    
    if (respuesta10Mini.equals("a")) {
      System.out.println("¡Correcto!");
      puntuacion++;
      System.out.println("La puntuación es " + puntuacion);
    } else {
        System.out.println("¡Incorrecto!");
        System.out.println("La puntuación es " + puntuacion);
      }
  }
}