
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main{
    public static void main(String[] args){
        //instancia de la clase Libro
        Libro libro = new Libro("J. K. Rowling", "Harry potter y la piedra filosofal", 10000);
        //instancia de la clase Miembro
        Miembro miembro = new Miembro("Juan", 001, 20);
        //prueba de metodos
        //estado de la disponibilidad del libro
        System.out.println(libro.isDisponible());
        //prestar libro

        miembro.prestarLibro(libro);
        
        //nuevo estado de la disponibilidad del libro
        System.out.println(libro.isDisponible());
        //devolver libro
        miembro.devolverLibro(libro);
        System.out.println("Juan devolvio el libro " + libro.getTitulo());
        //nuevo estado de la disponibilidad del libro
        System.out.println(libro.isDisponible());   
        
    }
}

