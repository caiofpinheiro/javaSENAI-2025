public class MainVeiculoCliente {
    public static void main(String[] args) {
        ClienteVeiculo clienteveic1 = new ClienteVeiculo("Caio", "18", "123.456.789-00",
         "rua caio", "123567890");
         System.out.println(clienteveic1.toString());
        Veiculo veiculo1 = new Veiculo("123ABC", "vermelho", "3",
         "100", "400km", "10");
         System.out.println(veiculo1.toString());
    }
}
