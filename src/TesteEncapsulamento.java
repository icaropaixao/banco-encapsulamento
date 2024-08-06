public class TesteEncapsulamento {
    public static void main(String[] args) {

        //Testando encapsulamento
        Conta conta = new Conta();

        conta.depositar(1000);
        conta.sacar(1500);

        System.out.println(conta.saldo);
    }
}
