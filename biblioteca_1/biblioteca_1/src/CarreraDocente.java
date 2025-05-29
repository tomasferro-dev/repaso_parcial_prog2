public class CarreraDocente {
    private String nombre;
    private int duracionAnios;

    public CarreraDocente(String nombre, int duracionAnios) {
        this.nombre = nombre;
        this.duracionAnios = duracionAnios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionAnios() {
        return duracionAnios;
    }

    public void setDuracionAnios(int duracionAnios) {
        this.duracionAnios = duracionAnios;
    }

    @Override
    public String toString() {
        return "CarreraDocente{" +
                "nombre='" + nombre + '\'' +
                ", duracionAnios=" + duracionAnios +
                '}';
    }
}
