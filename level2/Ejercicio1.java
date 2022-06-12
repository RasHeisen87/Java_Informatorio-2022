package level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking
Input (Entrada):
Bariloche
Córdoba
Resistencia
Output (Salida):
#1 - Bariloche
#2 - Cordoba
#3 - Resistencia
*/
public class Ejercicio1 {
    public static void main(String[] args) throws Exception{
        System.out.print("Ingrese sus provincias favoritas separadas por un -: ");
        //Se prepara para leer
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)) ;
        //lee
        String entrada = lee.readLine();
        //separa
        String[] espaciado = entrada.split("-") ;
        ArrayList<String> ciudades= new ArrayList<String>();
        for (String x : espaciado ){
            ciudades.add(x);
        } ;    

        String salida = "";
        for (int i = 0 ; i<ciudades.size();i++){
            salida = String.format("#%s - %s",(i+1),ciudades.get(i));
            System.out.println(salida);
        }
    }
}