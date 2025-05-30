import java.util.ArrayList;
import java.util.List;

public class Libro extends Publicacion{
    private String isbn;
    private Editorial editorial;
    private List<Autor> autores = new ArrayList<>();


    public Libro(String titulo, int anio, Genero genero, String isbn) {
        super(titulo, anio, genero);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void addAutor (Autor autor){
        this.autores.add(autor);
    }

    public void removeAutor(Autor autor){
        if (this.autores.contains(autor)){
            this.autores.remove(autor);
        } else {
            System.out.println("No se encontró");
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", editorial=" + editorial +
                ", autores=" + autores +
                '}';
    }
}
