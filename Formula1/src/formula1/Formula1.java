package formula1;

public class Formula1 {

    public static void main(String[] args) {
     
        Piloto senna = new Piloto("Ayrton Senna");
        Piloto hamilton = new Piloto("Lewis Hamilton");
      
        
        Corrida c[] = new Corrida[10];
        Corrida cc = new Corrida(senna, hamilton);
        for (int cont=0; cont < 10; cont++) {
            c[cont] = new Corrida(senna, hamilton);
            System.out.println("--- " + (cont+1) + "º CORRIDA ---");
            c[cont].correr();
            System.out.println("");
        }
        
        cc.classificacaoFinal();
        
    }
    
}
