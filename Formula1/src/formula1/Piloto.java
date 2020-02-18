package formula1;

public class Piloto {
    
    private String nome;
    private int pontuacao;
    
    public Piloto(String nome) {
        this.setNome(nome);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    public int getPontuacao() {
        return this.pontuacao;
    }
    
}
