public class Roda {
    public String fabricante;
    public String aro;
    public String tipo;

    public Roda(String fabricante, String aro, String tipo) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getAro() {
        return aro;
    }

    public void setAro(String aro) {
        this.aro = aro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
