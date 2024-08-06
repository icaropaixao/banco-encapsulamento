public class Conta {


    private int agencia;
    private int numero;
    private Cliente titular;
    private int numeroNULLtest;

    // usando o private antes para privar a variavel
    // e poder usar dentro da propria classe
    private double saldo;

    // METODO SEM RETORNO
    public void depositar(double valorDeposito){
        // adicionando valor ao saldo
        this.saldo += valorDeposito;
    }

    // METODO COM RETORNO
    public boolean sacar(double valorSaque){

        if(this.saldo >= valorSaque){
            saldo -= valorSaque;
            return true; // APLICANDO O SAQUE CASO O SALDO SEJA > OU = 0
        }else {
            return false;
        }

   }

   // METODODO COM REFERENCIA ENTRE CLASSES USANDO O THIS
    void transferir(double valorTransferencia, Conta destino){

                            // usando o sacar com this para fazer o saque e dps a transferencia
        boolean conseguiSacar = this.sacar(valorTransferencia);
        if(conseguiSacar){
            destino.depositar(valorTransferencia);
        }else {
            System.out.println("Transferencia não realizada pois o saldo é inferior ao valor requisitado");
        }
    }

    // --------------------------------------------------
    // MÉTODOS GETTERS - Métodos que vão retornar valores
    //MÉTODOS SETTERS- Métodos que vão atribuir valores

    //exemplo para pegar o valor do saldo pois ele esta como "private"
    // usaremos o metodo getters
    public double getSaldo() {
        return this.saldo; // retornando o atributo
    }

    // para atribuir um valor usa-se o método setters
    public void setSaldo(double saldo) {
        this.saldo = saldo; // "this" usado para especificar o atributo saldo da conta
    } // tipo void pois não retorna nada, somente atribui
    // double para dizer o tipo da variavel


    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia> 0 ){
            this.agencia = agencia;
        }
        this.agencia = agencia;

    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;

    }

    public Cliente getTitular(){
        return this.titular;

    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }
}

