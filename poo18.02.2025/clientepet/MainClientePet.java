public class MainClientePet {
    public static void main(String[] args) {
        Pet pet1 = new Pet("desgraca", "3", "husky");
        PetCliente petCliente = new PetCliente("Caio", "18", pet1);
        System.out.println(petCliente.toString());

    }
}
