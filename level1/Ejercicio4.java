package level1;

import java.io.*;

/*
 Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
Input (Entrada):
5
Output (Salida):
El factorial de 5 es: 120
*/

public class Ejercicio4 {
    // Copie y pegue la recursividad de la clase pasada
    public static int Factorial(int argumento){
        //aqui la salida
        if (argumento <= 1){
            return 1;
        }
        //aqui la parte iterativa
        else {
            int acarreo=argumento-1;
            return argumento * Factorial(acarreo);
        }
        
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Ingrese un solo numero entero del cual obtener factorial: ");
        // Se prepara para leer
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)) ;
        //lee
        String entrada = lee.readLine();
        int entrada_numero = Integer.parseInt(entrada);
        //aqui llamo a la funcion recursiva
        int b = Ejercicio4.Factorial(entrada_numero) ;
        System.out.println(String.format("El factorial de %s es: %d", entrada, b));

    }
}