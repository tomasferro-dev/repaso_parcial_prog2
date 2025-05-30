public class Alumno extends Usuario{
    private String legajo;
    private String nivel;
    private CategoriaAlumno categoriaAlumno;

    public Alumno(String nombre, String apellido, String dni, Telefono telefono, InstitucionEducativa institucionEducativa, String legajo, String nivel, CategoriaAlumno categoriaAlumno) {
        super(nombre, apellido, dni, telefono, institucionEducativa);
        this.legajo = legajo;
        this.nivel = nivel;
        this.categoriaAlumno = categoriaAlumno;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public CategoriaAlumno getCategoriaAlumno() {
        return categoriaAlumno;
    }

    public void setCategoriaAlumno(CategoriaAlumno categoriaAlumno) {
        this.categoriaAlumno = categoriaAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +super.toString()  +
                "legajo='" + legajo + '\'' +
                ", nivel='" + nivel + '\'' +
                ", categoriaAlumno=" + categoriaAlumno +
                '}';
    }
}
