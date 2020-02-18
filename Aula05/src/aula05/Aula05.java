package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaNoBanco pessoa1 = new ContaNoBanco();
        pessoa1.setNumConta(1111);
        pessoa1.setDono("Jubileu");
        pessoa1.abrirConta("cc");
        
        ContaNoBanco pessoa2 = new ContaNoBanco();
        pessoa2.setNumConta(2222);
        pessoa2.setDono("Creuza");
        pessoa2.abrirConta("cp");
        
        pessoa1.depositar(300f);
        pessoa2.depositar(500f);
        pessoa2.sacar(100f);
        
        pessoa1.sacar(350f);
        pessoa1.fecharConta();
        
        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
    }
    
}
