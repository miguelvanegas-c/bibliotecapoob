
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro {
    
    private String autor;
    private String titulo;
    private boolean disponible;// Al crearse el libro su valor sera true
    private int id;

    public Libro(String autor, String titulo, int id) {
        this.autor = autor;
        this.titulo = titulo;
        this.disponible = true;
        this.id = id;
    }
    
    public void setAutor(String newAutor){
        this.autor = newAutor;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setTitulo(String newTitulo){
        this.titulo = newTitulo;    
    }
    
    public String getTitulo(){
        return this.autor;
    }
    
    public int id(){
        return this.id;
    }
    
    public boolean isDisponible(){
        return this.disponible;
    }

    public void prestar(){
        if (disponible) {
            disponible = false;
            System.out.println(titulo + " del " + autor + " ha sido prestado");    
        } else { 
            System.out.println(titulo + " del " + autor + " no esta disponible");
        }
    }
    
    public void devolver(){
        this.disponible = true;
        System.out.println(titulo + " del " + autor + " ha sido devuelto");
    }
}
