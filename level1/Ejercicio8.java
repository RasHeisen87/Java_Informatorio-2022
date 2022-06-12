package level1;

import java.io.*;

/*
Crear una aplicación que solicite de entrada los datos de una persona en este
orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
Input (Entrada):
Homero Simpson
48
Calle Falsa 1234
Springfield
Output (Salida):
Springfield - Calle Falsa 1234 - 48 - Homero Simpson
*/
public class Ejercicio8 {
    public static void main(String[] args) throws Exception{
        // Se prepara para leer
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)) ;
        //aqui lee nombre y apellido
        System.out.print("Ingrese su nombre y apellido: ");
        String nya = lee.readLine();

        //aqui lee edad
        System.out.print("Ingrese su edad: ");
        String edad = lee.readLine();

        //aqui lee direccion
        System.out.print("Ingrese su direccion: ");
        String direccion = lee.readLine();

        //aqui lee ciudad
        System.out.print("Ingrese su ciudad: ");
        String ciudad = lee.readLine();

                
        //imprime
        String salida = String.format("{%s} - {%s} - {%s anyos} - {%s}",ciudad, direccion, edad, nya);
        System.out.println(salida);
            
    }
}
