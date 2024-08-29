import java.util.ArrayList;

/**
 * Write a description of class Miembro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Miembro
{
    private String nombre;
    private int id;
    private int edad;
    private ArrayList<Libro> librosPrestados;
    
    public Miembro(String nombre, int id, int edad){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }
    
    public void setNombre(String newNombre){
        this.nombre = newNombre;    
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setEdad(int newEdad){
        this.edad = newEdad;
    }
    
    public int getEdad(){
        return this.edad; 
    }
    
    public int getId(){
        return this.id; 
    }
    
    public ArrayList<Libro> getLibroPrestados(){
        return this.librosPrestados;
    }
    
    public void prestarLibro(Libro libro){
        if (libro.isDisponible()){
            libro.prestar();
            System.out.println("el libro ha sido prestado");
            librosPrestados.add(libro);
        } else {
            System.out.println("el libro no se encuentra disponible");
        }
        
    }

    public void devolverLibro(Libro libro){
        libro.devolver();
        System.out.println("el libro ya esta disponible");
        librosPrestados.remove(libro);
    }
}
