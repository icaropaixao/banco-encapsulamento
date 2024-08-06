public class TesteEncapsulamento {
    public static void main(String[] args) {

        //Testando encapsulamento
        Conta conta = new Conta();

        conta.depositar(1000);
        conta.sacar(1000);

        // MÉTODO GETTERS para pegar/retornar o valor do saldo
        System.out.println(conta.getSaldo());



    }
}
