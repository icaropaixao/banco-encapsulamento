public class Conta {
    int agencia;
    int numero;
    int numeroNULLtest;
    Cliente titular; // referencia entre objeto "  CLIENTE "
    String titularNULLtest;

    // usando o private antes para privar a variavel
    // e poder usar dentro da propria classe
   private double saldo;

    // METODO SEM RETORNO
    public void depositar(double valorDeposito){
        // adicionando valor ao saldo
        saldo += valorDeposito;
    }

    // METODO COM RETORNO
    public boolean sacar(double valorSaque){

        if(saldo >= valorSaque){
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



}

