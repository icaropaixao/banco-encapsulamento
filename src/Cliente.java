
public class Cliente {

    private String nome;
    private String cpf;
    private  String profissao;
    private double salario;

    // USANDO MÉTODO GETTERS E SETTERS
    public String getNome(){
        return this.nome;
    }

    //SETTER
    public void setNome(String nome){
        this.nome = nome;
    }

    // GETTER
    public String getCpf() {
        return cpf;
    }

    //SETTER
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // GETTER
    public String getProfissao() {
        return profissao;
    }

    //SETTER
    public void setProfissao(String profissão) {
        this.profissao = profissão;
    }

    // GETTER
    public double getSalario() {
        return salario;
    }

    //SETTER
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
