import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("San Martin");
        Editorial editorial = new Editorial("Estrada");
        Telefono telefono = new Telefono("261000000", "Cel");
        UbicacionBiblioteca ubicacionBiblioteca = new UbicacionBiblioteca(1, "A");
        InstitucionEducativa institucionEducativa = new InstitucionEducativa("UTN");
        CategoriaAlumno categoriaAlumno = new CategoriaAlumno("Presencial");
        CarreraDocente carreraDocente = new CarreraDocente("Nombre", 12);

        // Autores
        Autor autor1 = new Autor("Edgar");
        Autor autor2 = new Autor("Michael");
        // Generos
        Genero genero1 = new Genero("Accion");
        Genero genero2 = new Genero("Ciencia");

        // Publicaciones
        Libro libro1 = new Libro("SpiderMan", 1997, genero1, "123");
        Revista revista1 = new Revista("Animales Salvajes", 2007, genero2, 1, 2);

        // Ejemplares de las publicaciones
        Ejemplar ejemplar1 = new Ejemplar("111", EstadoEjemplar.DISPONIBLE);
        ejemplar1.setPublicacion(libro1);
        Ejemplar ejemplar2 = new Ejemplar("222", EstadoEjemplar.DISPONIBLE);
        ejemplar2.setPublicacion(libro1);

        Ejemplar ejemplar3 = new Ejemplar("333", EstadoEjemplar.DISPONIBLE);
        ejemplar3.setPublicacion(revista1);
        Ejemplar ejemplar4 = new Ejemplar("444", EstadoEjemplar.DISPONIBLE);
        ejemplar4.setPublicacion(revista1);

        libro1.addAutor(autor1);
        libro1.addEjemplar(ejemplar1);
        libro1.addEjemplar(ejemplar2);

        revista1.addEjemplar(ejemplar3);
        revista1.addEjemplar(ejemplar4);

        // Prestamos con linea prestamo
        Prestamo prestamo1 = new Prestamo(LocalDate.now());
        prestamo1.addLineaPrestamo(LocalDate.now(), LocalDate.now(), ejemplar1);
        prestamo1.addLineaPrestamo(LocalDate.now(), LocalDate.now(), ejemplar2);

        Prestamo prestamo2 = new Prestamo(LocalDate.now());
        prestamo2.addLineaPrestamo(LocalDate.now(), LocalDate.now(), ejemplar3);

        // Devolver ejemplar
        prestamo1.devolverEjemplar(ejemplar2);

        // Alumnos y Docentes
        Alumno alumno1 = new Alumno("Tomas", "Martinez", "40999777", telefono, institucionEducativa, "41023", "Universitario", categoriaAlumno);
        Docente docente = new Docente("Alberto", "Cortez", "3044455", telefono, institucionEducativa, "123123", "Programacion", carreraDocente);

        // Asigno prestamos a alumnos y docentes
        alumno1.addPrestamo(prestamo1);
        docente.addPrestamo(prestamo2);


        System.out.println(alumno1);

    }
}