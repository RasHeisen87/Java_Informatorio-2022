package level1;

import java.io.*;

/*
Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números.
*/
public class Ejercicio2 {
    public static void main(String[] args) throws IOException{
        System.out.print("Ingrese 2 numeros enteros separados por espacio: ");
        // Se prepara para leer
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)) ;
        //lee
        String entrada = lee.readLine();
        //separa
        String[] espaciado = entrada.split(" ") ;
        System.out.println("Los numeros ingresados son: ");
        for (String x : espaciado ){
            System.out.println(" "+x);
        } ;    
        int a = Integer.parseInt(espaciado[0]);
        int b = Integer.parseInt(espaciado[1]);
        System.out.println("El resultado de la suma es: "+(a+b));
        System.out.println("El resultado de la resta es: "+(a-b));
        System.out.println("El resultado de la multiplicacion es: "+(a*b));
        System.out.println("El resultado de la division es: "+(a/b));
        System.out.println("El resultado del modulo es: "+(a % b));

    }
}
