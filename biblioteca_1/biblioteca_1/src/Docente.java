public class Docente extends Usuario {
    private String matricula;
    private String especialidad;
    private CarreraDocente carreraDocente;

    public Docente(String nombre, String apellido, String dni, Telefono telefono, InstitucionEducativa institucionEducativa, String matricula, String especialidad, CarreraDocente carreraDocente) {
        super(nombre, apellido, dni, telefono, institucionEducativa);
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.carreraDocente = carreraDocente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public CarreraDocente getCarreraDocente() {
        return carreraDocente;
    }

    public void setCarreraDocente(CarreraDocente carreraDocente) {
        this.carreraDocente = carreraDocente;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "matricula='" + matricula + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", carreraDocente=" + carreraDocente +
                '}';
    }
}
