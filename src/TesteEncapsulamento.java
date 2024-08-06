public class TesteEncapsulamento {
    public static void main(String[] args) {
        // criando cliente
        Cliente clienteIcaro = new Cliente();
        clienteIcaro.setNome("Ícaro");
        clienteIcaro.setProfissao("Programador");
        clienteIcaro.setCpf("18877429720");
        clienteIcaro.setSalario(25000);

        //Testando encapsulamento
        Conta conta = new Conta();
        conta.setAgencia(10);// adicionando um valor a agencia com Set
        conta.depositar(1000);
        conta.setTitular(clienteIcaro);
        // MÉTODO GETTERS para retornar o valor do saldo
        System.out.println(conta.getSaldo());
        // pegando o titular através do método get
        System.out.println(conta.getTitular().getNome());
        System.out.println("saldo: " + conta.getSaldo());
        // testando se esta no mesmo espaço de memoria se é o mesmo cliente mesmo
        System.out.println("mesmo caminho: " + clienteIcaro);
        System.out.println("mesmo caminho: " +conta.getTitular());

        // criando um novo titular
        Conta contaTwo = new Conta();

        contaTwo.setTitular(new Cliente());
        contaTwo.getTitular().setNome("Pedro");
        contaTwo.getTitular().setSalario(10000);

        System.out.println("DOIS: "+ contaTwo.getTitular().getNome());
        System.out.println("DOIS: "+ contaTwo.getTitular().getSalario());

    }
}
