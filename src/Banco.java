import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

}
