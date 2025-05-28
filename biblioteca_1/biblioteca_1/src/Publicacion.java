import java.util.ArrayList;
import java.util.List;

public abstract class Publicacion {
    private String titulo;
    private int anio;
    private Genero genero;
    private List<Ejemplar> ejemplares = new ArrayList<>();

    public Publicacion(String titulo, int anio, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }

    public String getInfo() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
