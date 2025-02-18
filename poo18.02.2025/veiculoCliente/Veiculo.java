public class Veiculo {
    private String placa;
    private String cor;
    private String numeroPassageiros;
    private String tankCap;
    private String maxVel;
    private String consumoMed;

    public Veiculo(String placa, String cor, String numeroPassageiros, String tankCap, String maxVel,
            String consumoMed) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.tankCap = tankCap;
        this.maxVel = maxVel;
        this.consumoMed = consumoMed;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(String numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public String getTankCap() {
        return tankCap;
    }

    public void setTankCap(String tankCap) {
        this.tankCap = tankCap;
    }

    public String getMaxVel() {
        return maxVel;
    }

    public void setMaxVel(String maxVel) {
        this.maxVel = maxVel;
    }

    public String getConsumoMed() {
        return consumoMed;
    }

    public void setConsumoMed(String consumoMed) {
        this.consumoMed = consumoMed;
    }

    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", cor=" + cor + ", numeroPassageiros=" + numeroPassageiros + ", tankCap="
                + tankCap + ", maxVel=" + maxVel + ", consumoMed=" + consumoMed + "]";
    }
    
    
    
}
