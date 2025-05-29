import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nombre;
    private String apellido;
    private String dni;
    private Telefono telefono;
    private InstitucionEducativa institucionEducativa;
    private List<Prestamo> prestamos = new ArrayList<>();

    public Usuario(String nombre, String apellido, String dni, Telefono telefono, InstitucionEducativa institucionEducativa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.institucionEducativa = institucionEducativa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public InstitucionEducativa getInstitucionEducativa() {
        return institucionEducativa;
    }

    public void setInstitucionEducativa(InstitucionEducativa institucionEducativa) {
        this.institucionEducativa = institucionEducativa;
    }

    public void addPrestamo (Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono=" + telefono +
                ", institucionEducativa=" + institucionEducativa +
                ", prestamos=" + prestamos +
                '}';
    }
}
