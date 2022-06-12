package level1;

import java.io.*;
/*
Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías).
Input (Entrada):
2
3
Output (Salida):
2 x 3 = 6
*/

public class Ejercicio5 {
    public static int AquiMultiplica(int argumento,int argumento2){
        if (argumento2 == 0){
            return 0;
        }
        int a = argumento;
        int b = argumento2;
        int resultadofinal = a;
        //sumo a si mismo hasta que i sea mayor o igual a b
        for (int i=1; i<b;i++ ){
            resultadofinal+=a;
        }
        return resultadofinal;
    }
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
        int aquiguardo = AquiMultiplica(a, b);
        
        System.out.println("El resultado de la multiplicacion es: "+ aquiguardo);
    }
    
}
