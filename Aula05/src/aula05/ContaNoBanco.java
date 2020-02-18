package aula05;

public class ContaNoBanco {

    private String dono;
    private int numConta;
    private String tipo;
    private boolean status;
    private float saldo;

    public ContaNoBanco() {
        this.status = false;
        this.saldo = 0f;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void estadoAtual() {
        System.out.println("----------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String tipo) {
        this.status = true;
        this.setTipo(tipo);
        if (this.tipo.equals("cc")) {
            this.saldo += 50;
        } else if (this.tipo.equals("cp")) {
            this.saldo += 150;
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada");
        }
    
    }
    
    public void depositar(float valorDeposito) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valorDeposito);
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Impossível depositar");
        }
    }
    
    public void sacar(float valorSaque) {
        if (this.getStatus()) {
            if (this.getSaldo() >= valorSaque) {
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Saque realizado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.tipo.equals("cc")) {
            v = 12;
        } else if (this.tipo.equals("cp")) {
            v = 20;
        }    
        if (this.status == true) {
            if (this.saldo > v) {
                this.saldo -= v;
                System.out.println("Mensalidade paga");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }            
    }
    
}
