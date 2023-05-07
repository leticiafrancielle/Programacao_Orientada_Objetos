public class Carro extends Veiculo{

    public Carro() {}
    public Carro(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas) {
        super(id, velocidadeAtual, velocidadeMaxima, precisaoEmCurvas);
    }

    @Override
    public void utilizarHabilidadeEspecial() {
        System.out.println("Carro fechou o adversário de trás");
    }
}
