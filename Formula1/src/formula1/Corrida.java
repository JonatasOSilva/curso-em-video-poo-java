package formula1;
 
import java.util.Random;

public class Corrida {
    
    private Piloto piloto1;
    private Piloto piloto2;
    
    public Corrida(Piloto plt1, Piloto plt2) {
        this.piloto1 = plt1;
        this.piloto2 = plt2;
    }
    
    public void correr() {
        Random numAle = new Random();
        int pos = numAle.nextInt(2);
        switch(pos) {
            case 0:
                piloto1.setPontuacao(piloto1.getPontuacao() + 1);
                System.out.println("1º lugar: " + piloto1.getNome());
                System.out.println("2º lugar: " + piloto2.getNome());
                break;
            case 1:
                piloto2.setPontuacao(piloto2.getPontuacao() + 1);
                System.out.println("1º lugar: " + piloto1.getNome());
                System.out.println("2º lugar: " + piloto2.getNome());
                break;
        }
    }  
    
    public void classificacaoFinal() {
        System.out.println("--- CLASSIFICAÇÃO FINAL ---");
        if (piloto1.getPontuacao() > piloto2.getPontuacao()) {
            System.out.println("1º lugar: " + piloto1.getNome() + "(" + piloto1.getPontuacao() + ")");
            System.out.println("2º lugar: " + piloto2.getNome() + "(" + piloto2.getPontuacao() + ")");
        } else {
            System.out.println("1º lugar: " + piloto2.getNome() + "(" + piloto2.getPontuacao() + ")");
            System.out.println("2º lugar: " + piloto1.getNome() + "(" + piloto1.getPontuacao() + ")");
        }
        
    
        
    }
    
}
