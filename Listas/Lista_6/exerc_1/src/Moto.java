public class Moto extends Veiculo{

    public Moto() {}
    public Moto(int id, int velocidadeAtual, int velocidadeMaxima, int precisaoEmCurvas) {
        super(id, velocidadeAtual, velocidadeMaxima, precisaoEmCurvas);
    }

    @Override
    public void utilizarHabilidadeEspecial() {
        System.out.println("Moto ultrapassou o adversário à frente");
    }
}
