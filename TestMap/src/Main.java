import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //      Nome    ID
        HashMap<Integer, String> Pessoa = new HashMap<>();
        Pessoa.put(1, "Thiago");
        Pessoa.put(2, "Manuelly");
        Pessoa.put(3, "Thiago");

        System.out.println(Pessoa);

        int IdBusca = 2;
        String nomeBusca = Pessoa.getOrDefault(IdBusca, "ID não encontrado!");
        System.out.println("O nome associado ao ID " + IdBusca + " é " + nomeBusca);
    }
}