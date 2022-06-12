package level1;

import java.io.*;

/*
Realizar un programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase().
Input (Entrada):
informatorio
Output (Salida):
INFORMATORIO
*/
public class Ejercicio7 {

    public static String QuieroUppercase(String argumento){
        char[] cadenadecaracteres = argumento.toCharArray();
        String salida = "";
        
        for (char i : cadenadecaracteres){
            if ('a'<=i && i<='z'){
                // (char) cualquier entero devuelve un caracter de acuerdo a su valor entero
                salida = salida+((char) ((int) i - 32));
            }else{
                salida = salida+i;
            }
        }
        return salida;
    }
    public static void main(String[] args) throws Exception{
        System.out.print("Ingrese aqui su texto: ");
        //Se prepara para leer
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)) ;
        //lee
        String entrada = lee.readLine();
        //Aqui llamo a la funcion que convierte a Mayusculas
        entrada = QuieroUppercase(entrada);
        //imprime
        String salida = String.format("La salida es: %s", entrada);
        
        System.out.println(salida);
    }
}