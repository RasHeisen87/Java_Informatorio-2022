package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.
Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]
## Los arrays son iguales y corresponden a los días trabajados de una
semana Lun-Vie.
Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915
 */
public class Ejercicio5 {
    public static void main(String[] args) throws IOException{
        //Se prepara para leer
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)) ;
        
        //Aqui lee las horas trabajadas
        System.out.print("Ingrese sus horas trabajadas separadas por un - : ");
        String entrada = lee.readLine();
        //separa las horas trabajadas
        ArrayList<Integer> lista_horas= new ArrayList<Integer>();
        for (String x : entrada.split("-") ){
            lista_horas.add(Integer.valueOf(x));
        }
        //lee el valor de horas trabajadas
        System.out.print("Ingrese valor por horas trabajadas separadas por un - : ");
        entrada = lee.readLine();
        //separa el valor de horas trabajadas
        ArrayList<Integer> lista_valor= new ArrayList<Integer>();
        for (String x : entrada.split("-") ){
            lista_valor.add(Integer.valueOf(x));
        }
        if (lista_horas.size() != lista_valor.size()){
            System.out.print("Tamaño de listas no iguales!!!");
            return ;
        }
        //prepara la salida
        ArrayList<Integer> lista_salida = new ArrayList<Integer>();
        for (int i=0 ; i<lista_horas.size();i++){
            lista_salida.add((lista_horas.get(i)*lista_valor.get(i)));
        }
        System.out.println(lista_horas);
        System.out.println(lista_valor);
        System.out.println(lista_salida);
    }
}