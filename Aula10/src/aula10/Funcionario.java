package aula10;

public class Funcionario extends Pessoa {

    private boolean trabalhando;
    private String setor;
    
    public void mudarTrbalho() {
        this.trabalhando = !this.trabalhando;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
