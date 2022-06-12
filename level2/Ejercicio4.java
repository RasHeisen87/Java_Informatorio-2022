package level2;

import java.util.ArrayList;

/*
 * Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.
Ayuda: ArrayList posee un método para particionar en sub-listas?
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> nombres_estudiantes = new ArrayList<String>();
        nombres_estudiantes.add("Ruben");
        nombres_estudiantes.add("Carlos");
        nombres_estudiantes.add("Lorena");
        nombres_estudiantes.add("Nestor");
        nombres_estudiantes.add("Gisela");
        nombres_estudiantes.add("Juan");
        nombres_estudiantes.add("Ernesto");
        nombres_estudiantes.add("Liliana");
        nombres_estudiantes.add("Maximiliano");
        nombres_estudiantes.add("Rita");
        nombres_estudiantes.add("Joaquin");
        nombres_estudiantes.add("Maria");
        ArrayList<String> clase1 = new ArrayList<String>(nombres_estudiantes.subList(0, 4));
        ArrayList<String> clase2 = new ArrayList<String>(nombres_estudiantes.subList(4, 8));
        ArrayList<String> clase3 = new ArrayList<String>(nombres_estudiantes.subList(8, 12));
        System.out.println("Todos los estudiantes: " + nombres_estudiantes);
        System.out.println("Clase 1: "+clase1);
        System.out.println("Clase 2: "+clase2);
        System.out.println("Clase 3: "+clase3);
    }
}