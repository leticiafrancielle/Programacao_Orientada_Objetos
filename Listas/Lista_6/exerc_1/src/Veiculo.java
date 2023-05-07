public abstract class Veiculo {
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private boolean estaComFarolLigado;

    public Veiculo(){}

    public Veiculo(int id, int velocidadeAtual,int velocidadeMaxima, int precisaoEmCurvas){
        this.id = id;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public void acelerar() {
        this.velocidadeAtual = velocidadeAtual + 10;
        System.out.println("Vrum, vrum");
    }

    public void desacelerar() {
        this.velocidadeMaxima = velocidadeMaxima - 10;
        System.out.println("Desacelerando...");
    }

    public void ligarFarol(){
        this.estaComFarolLigado = true;
        System.out.println("O farol está ligado.");
    }

    public abstract void utilizarHabilidadeEspecial();

}

