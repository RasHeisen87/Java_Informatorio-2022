package level1;

import java.io.*;

/*
. Confeccionar un programa que dado un número entero como dato de entrada
imprima la secuencia de números (incrementos de 1) de la siguiente forma:
Input (Entrada):
5
Output (Salida):
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

public class Ejercicio3 {
    public static void main(String[] args) throws IOException{
        System.out.print("Ingrese un solo numero entero para secuenciar: ");
        // Se prepara para leer
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)) ;
        //lee
        String entrada = lee.readLine();
        int entrada_nro = Integer.parseInt(entrada) + 1;
        String salida = "";
        for (int i = 1; i<entrada_nro;i++){
            salida = salida +" "+ i;
            System.out.println(salida);
        }

    }
    
}