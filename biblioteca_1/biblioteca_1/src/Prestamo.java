import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private List<LineaPrestamo> lineaPrestamos = new ArrayList<>();

    public Prestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    // add y remove
    public void addLineaPrestamo (LocalDate fechaDevolucionEstimada, LocalDate fechaDevolucionReal, Ejemplar ejemplar){
        this.lineaPrestamos.add(new LineaPrestamo(fechaDevolucionEstimada, fechaDevolucionReal, ejemplar));
        ejemplar.setEstado(EstadoEjemplar.PRESTADO);
    }

    public void devolverEjemplar (Ejemplar ejemplar) {
        for (LineaPrestamo lp : lineaPrestamos) {
            if (lp.getEjemplar().equals(ejemplar)) {
                lp.setFechaDevolucionReal(LocalDate.now());
                break;
            }
        }
        ejemplar.setEstado(EstadoEjemplar.DISPONIBLE);

    }


    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", lineaPrestamos=" + lineaPrestamos +
                '}';
    }
}
