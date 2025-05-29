public class UbicacionBiblioteca {
    private int piso;
    private String sala;

    public UbicacionBiblioteca(int piso, String sala) {
        this.piso = piso;
        this.sala = sala;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "UbicacionBiblioteca{" +
                "piso=" + piso +
                ", sala='" + sala + '\'' +
                '}';
    }
}
