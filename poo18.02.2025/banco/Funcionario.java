public class Funcionario {
    private String codeFunc;
    private String nome;
    private String telefone;
    private String email;
    private ContaBancaria ContaBancacaria;
    private Endereco Endereco;
    
    public Funcionario(String codeFunc, String nome, String telefone, String email,
            ContaBancaria contaBancacaria, Endereco endereco2) {
        this.codeFunc = codeFunc;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        ContaBancacaria = contaBancacaria;
        Endereco = endereco2;
    }

    public String getCodeFunc() {
        return codeFunc;
    }

    public void setCodeFunc(String codeFunc) {
        this.codeFunc = codeFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBancacaria() {
        return ContaBancacaria;
    }

    public void setContaBancacaria(ContaBancaria contaBancacaria) {
        ContaBancacaria = contaBancacaria;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco endereco) {
        Endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario [codeFunc=" + codeFunc + ", nome=" + nome + ", telefone="
                + telefone + ", email=" + email + ", ContaBancacaria=" + ContaBancacaria + ", Endereco=" + Endereco
                + "]";
    }

    
 
}
