package level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Se dispone de una colección de Empleados, de cada empleado se conoce:
○ Nombre y Apellido nya
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado.
 */

// una clase muy simple para realizar el ejercicio
class Empleado {
    public String nya;
    public int dni;
    public int horasTrabajadas;
    public int valorPorHora;

    public Empleado(int dni, String nya, int horasTrabajadas, int valorPorHora){
        this.nya = nya;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.valueOf(this.dni)+
            " - "+this.nya;
    }
}

public class Ejercicio6 {
    

    public static void main(String[] args) {
        //Inicializa el hashset
        Set<Empleado> empleados = new HashSet<Empleado>();
        //Inicializa HashMap
        Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();
        //Carga de prueba Empleados
        empleados.add(new Empleado(24897237, "Ramon", 6, 200));
        empleados.add(new Empleado(35867081, "Juana", 8, 300));
        //Carga sueldos
        for (Empleado i : empleados) {
            sueldos.put(i.dni, (i.horasTrabajadas*i.valorPorHora));
        }

       
        System.out.println("Sueldo para dni 24897237: "+sueldos.get(24897237));
    }
}
