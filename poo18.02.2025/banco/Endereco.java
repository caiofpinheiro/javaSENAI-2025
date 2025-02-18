public class Endereco {
    private String logradouro;
    private String rua;
    private String numero;
    
    public Endereco(String logradouro, String rua, String numero) {
        this.logradouro = logradouro;
        this.rua = rua;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco [logradouro=" + logradouro + ", rua=" + rua + ", numero=" + numero + "]";
    }

    

}
