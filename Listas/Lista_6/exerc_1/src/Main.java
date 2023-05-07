public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(1,60,80,30);
        carro.ligarFarol();
        carro.desacelerar();
        carro.acelerar();
        carro.utilizarHabilidadeEspecial();

        System.out.println("\n");

        Moto moto = new Moto(1,50,70,20);
        moto.ligarFarol();
        moto.desacelerar();
        moto.acelerar();
        moto.utilizarHabilidadeEspecial();
    }
}
