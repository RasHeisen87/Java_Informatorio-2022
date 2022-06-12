package level1;

import java.io.*;

/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada.
Input (Entrada):
Hola Informatorio Java 2022.
a
Output (Salida):
4
*/
public class Ejercicio9 {
    public static void main(String[] args) throws IOException{
         //Se prepara para leer
         BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)) ;
         //Aqui lee el caracter a contar
         System.out.print("Ingrese aqui la letra a contar: ");
         char letra = (lee.readLine().charAt(0));
         
         //Aqui lee la entrada
         System.out.print("Ingrese su texto: ");
         String entrada = lee.readLine();
         char[] temp = entrada.toCharArray();
         int contador = 0;
         for (char i : temp ){
            if (i == letra){
                contador++;
            }
         }
        String salida = String.format("La letra %s se repite: %d veces",letra,contador);
        System.out.println(salida);

    }    
}
