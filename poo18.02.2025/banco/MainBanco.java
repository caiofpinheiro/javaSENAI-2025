public class MainBanco {
    public static void main(String[] args) {
        ContaBancaria contabancaria1 = new ContaBancaria("itau", "000-1", "poupança",
         "5000", "7000");
        Endereco endereco1 = new Endereco("01-01", "rua caio", "1234");
        Funcionario funcionario1 = new Funcionario("01010", "Caio", "123456789",
         "caioi@gmai.com", contabancaria1, endereco1);
         System.out.println(funcionario1.toString());
    }

}
