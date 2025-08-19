public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();


        Cliente kaiky = new Cliente();
        kaiky.setNome("Kaiky");
        Conta contaCorrenteKaiky = new ContaCorrente(kaiky);
        Conta contaPoupancaKaiky = new ContaPoupanca(kaiky);
        banco.adicionarConta(contaPoupancaKaiky);
        banco.adicionarConta(contaCorrenteKaiky);

        Cliente evelyn = new Cliente();
        evelyn.setNome("Evelyn");
        Conta contaCorrenteEvelyn = new ContaCorrente(evelyn);
        Conta contaPoupancaEvelyn = new ContaPoupanca(evelyn);
        banco.adicionarConta(contaCorrenteEvelyn);
        banco.adicionarConta(contaCorrenteEvelyn);


        contaCorrenteKaiky.depositar(500);
        contaCorrenteEvelyn.depositar(900);
        contaCorrenteEvelyn.transferir(contaCorrenteKaiky, 400);
        contaCorrenteKaiky.sacar(700);


        contaCorrenteKaiky.imprimirExtrato();
        contaCorrenteEvelyn.imprimirExtrato();
    }
}