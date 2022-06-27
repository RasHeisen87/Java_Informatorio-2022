package level3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.Period;

/*Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
generar un Map<String, Integer> donde la clave de Map será el apellido
concatenado con el nombre (con separador de espacio en blanco) y el value la
edad del alumno.
● La lista de entrada debe estar cargada con varios alumnos (al menos 5)
para subir el ejemplo y demostrar su funcionamiento.
● En ejemplo se muestra solo con 1 Alumno a modo de abreviar●
En el ejemplo también se usa LocalDate.now().minusYears(30), en el
ejercicio a presentar se deberá usar otra tecnica de construcción para la
fecha (no usar .now(). Pueden ver métodos .parse(), etc)
Input (Entrada)
List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson",
LocalDate.now().minusYears(30)));
Output (Salida):
{"Simpson Homero"=30} */

class Alumno {
    public String apellido;
    public String nombre;
    public LocalDate fechaDeNacimiento;
    public Alumno(String apellido, String nombre, LocalDate fechaDeNacimiento){
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public String getNyA(){
        return (this.nombre+" "+this.apellido);
    }
    public LocalDate getFecha(){
        return this.fechaDeNacimiento;
    }
    @Override
    public String toString() {
        return String.valueOf(this.fechaDeNacimiento)+
            " - "+this.nombre+" "+this.apellido;
    }
}

public class Ejercicio5 {


    public static void main(String[] args){
        LocalDate fechacomparar = LocalDate.parse("2022-01-01");
        List<Alumno> listaAlumnos = List.of(
            new Alumno("Simpson", "Homero", LocalDate.parse("1980-08-16")),
            new Alumno("Perez", "Juan", LocalDate.parse("1969-04-20")),
            new Alumno("Wang", "Lo", LocalDate.parse("1989-06-01")),
            new Alumno("Freeman", "Gordon", LocalDate.parse("1970-04-12")),
            new Alumno("Doe", "John", LocalDate.parse("1950-01-01"))

        );
        
        Map<String, Integer> salida = listaAlumnos.stream()
            .collect(Collectors
            .toMap(elemento-> elemento.getNyA(),elemento-> Period.between(elemento.getFecha(), fechacomparar).getYears(),
            (existing, replacement) -> existing ))
        
        ;
        System.out.println(salida);
        
    }
}