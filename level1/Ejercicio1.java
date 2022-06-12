package level1;

import java.io.*;

/*
Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
mensaje “HOLA {USUARIO}!!!”
Input (Entrada):
Obi Wan Kenobi
Output (Salida):HOLA Obi Wan Kenobi!!!
*/
public class Ejercicio1 {
    public static void main(String[] args) throws IOException{
        System.out.print("Ingrese su nombre: ");
        // Se prepara para leer
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)) ;
        //lee
        String entrada = lee.readLine();
        //imprime
        String salida = String.format("Hola %s!!!", entrada);
        System.out.println(salida);
    }    
}