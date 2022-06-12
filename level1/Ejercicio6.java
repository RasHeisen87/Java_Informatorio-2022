package level1;

import java.io.*;

/*
 * 
 * Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías).
Input (Entrada):
3
3
Output (Salida):
3 elevado a 3 = 27
 */
public class Ejercicio6 {
    //shameless ctrl+c and ctrl+v from ej5
    public static int MultiplicoAca(int argumento,int argumento2){
        int a = argumento;
        int b = argumento2;
        int resultadofinal = a;
        //aqui sumo a si mismo hasta que i sea mayor o igual a b
        for (int i=1; i<b;i++ ){
            resultadofinal+=a;
        }
        return resultadofinal;
    }
    public static void main(String[] args) throws IOException{
        System.out.print("Ingrese 2 numeros enteros separados por espacio, segundo siendo potencia: ");
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
        int aquiguardo = a;
        // si es 0, solo pongo que sea 1 la salida
        if (b==0) {
            aquiguardo = 1;
        }
        //Aqui multiplica por si mismo usando funcion del ejercicio 5 hasta que i sea mayor u igual a b
        for (int i=1; i<b;i++ ){
            aquiguardo=MultiplicoAca(aquiguardo, a);
        }
        String estoescribo = "El resultado de la potencia es: ";
        String resultadotexto = String.valueOf(aquiguardo);
        if (a == 0 && b == 0){
            resultadotexto = "Indefinido!";
        }
        System.out.println(estoescribo+resultadotexto);
    }
}
