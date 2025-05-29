public class CategoriaAlumno {
    private String descripcion;

    public CategoriaAlumno(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "CategoriaAlumno{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
