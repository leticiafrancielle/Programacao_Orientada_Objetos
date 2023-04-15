package Personagens;

public class Monstro {
    int ataque;
    int forca;
    int quantidadeHabilidades;
    int resistencia;
    public String categoria;

    public Monstro(String categoria, int ataque, int forca, int quantidadeHabilidades, int resistencia) {
        this.categoria = categoria;
        this.ataque = ataque;
        this.forca = forca;
        this.quantidadeHabilidades = quantidadeHabilidades;
        this.resistencia = resistencia;

    }
}
