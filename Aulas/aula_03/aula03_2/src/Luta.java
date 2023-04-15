import java.util.ArrayList;

public class Luta {

    String estiloDeLuta;
    Lutador lutador1 = new Lutador();
    Lutador lutador2 = new Lutador();

    public void apresentar(){
        System.out.println("De um lado, pesando " + lutador1.peso + "kg " + ", temos " + lutador1.nome);

        System.out.println("Do outro lado, pesando " + lutador1.peso + "kg " + ", temos " + lutador2.nome);
    }


}
