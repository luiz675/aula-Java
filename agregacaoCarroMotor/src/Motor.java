public class Motor {
    public String fabricante;
    public  String tipoCombustivel;
    public float cilindradas;

    public Motor(String fabricante, String tipoCombustivel, float cilindradas) {
        this.setFabricante(fabricante);
        this.setTipoCombustivel(tipoCombustivel);
        this.setCilindradas(cilindradas);
    }
    public  String retornaMotor(){
        return "Fabricante" + this.getFabricante() +
                "Tipo Combustivel: " + this.getTipoCombustivel() +
                "Cilindradas: " + this.getCilindradas();
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public float getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(float cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
