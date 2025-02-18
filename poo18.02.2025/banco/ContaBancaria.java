public class ContaBancaria {

    private String banco;
    private String agencia;
    private String tipoConta;
    private String saldoAtual;
    private String limiteDisp;
    
    public ContaBancaria(String banco, String agencia, String tipoConta, String saldoAtual, String limiteDisp) {
        this.banco = banco;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisp = limiteDisp;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(String saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public String getLimiteDisp() {
        return limiteDisp;
    }

    public void setLimiteDisp(String limiteDisp) {
        this.limiteDisp = limiteDisp;
    }

    @Override
    public String toString() {
        return "ContaBancaria [banco=" + banco + ", agencia=" + agencia + ", tipoConta=" + tipoConta + ", saldoAtual="
                + saldoAtual + ", limiteDisp=" + limiteDisp + "]";
    }

    

}
