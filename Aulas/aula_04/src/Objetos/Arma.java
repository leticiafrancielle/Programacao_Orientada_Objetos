package Objetos;

public class Arma {
    int dano;
    boolean longoAlcance;
    String tipo;
    public String categoria;

    public Arma(String categoria, int dano, boolean longoAlcance, String tipo){
        this.categoria = categoria;
        this.dano = dano;
        this.tipo = tipo;

    }

}
