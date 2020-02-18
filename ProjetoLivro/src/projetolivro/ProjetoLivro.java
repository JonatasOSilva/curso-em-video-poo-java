package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
    
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria Candida", 25, "F");
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("Poo para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candida", 800, p[0]);
        
        l[0].detalhes();
        l[2].detalhes();
    }
    
}
