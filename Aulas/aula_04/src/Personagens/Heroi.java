package Personagens;

import Objetos.Arma;

import java.util.ArrayList;

public class Heroi {
    private String nome;
    private int quantidadeHabilidades;
    private int pontoDeVida;
    private int forca;
   private String categoria;
    ArrayList<Arma> armas;

    public Heroi(String categoria, int pontoDeVida, int forca, int quantidadeHabilidades, String nome){
        this.categoria = categoria;
        this.forca = forca;
        this.pontoDeVida = pontoDeVida;
        this.quantidadeHabilidades = quantidadeHabilidades;
        this.nome = nome;
    }
    public String getCategoria(){
       return "A categoria do herói é " + this.categoria;
    }
    public int getQuantidadeHabilidades(){
        return this.quantidadeHabilidades;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setPontoDeVida(int pontoDeVida){
        this.pontoDeVida = pontoDeVida;
    }
    public int getPontoDeVida(){
        return this.pontoDeVida;
    }
    public String getNome(){
        return this.nome;
    }
}
