import java.time.LocalDate;

public class LineaPrestamo {
    private LocalDate fechaDevolucionEstimada;
    private LocalDate getFechaDevolucionReal;
    private Ejemplar ejemplar;

    public LineaPrestamo(LocalDate fechaDevolucionEstimada, LocalDate getFechaDevolucionReal, Ejemplar ejemplar) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
        this.getFechaDevolucionReal = getFechaDevolucionReal;
        this.ejemplar = ejemplar;
    }

    public LocalDate getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public void setFechaDevolucionEstimada(LocalDate fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public LocalDate getGetFechaDevolucionReal() {
        return getFechaDevolucionReal;
    }

    public void setGetFechaDevolucionReal(LocalDate getFechaDevolucionReal) {
        this.getFechaDevolucionReal = getFechaDevolucionReal;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    @Override
    public String toString() {
        return "LineaPrestamo{" +
                "fechaDevolucionEstimada=" + fechaDevolucionEstimada +
                ", getFechaDevolucionReal=" + getFechaDevolucionReal +
                ", ejemplar=" + ejemplar +
                '}';
    }
}
