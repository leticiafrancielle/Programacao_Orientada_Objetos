package jogo;

import Mapas.Masmorra;
import Objetos.Arma;
import Personagens.Heroi;
import Personagens.Monstro;

public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Ladino", 10, 7, 5, "Gandalf");
        System.out.println("O nome do herói é: " + heroi.getNome());

        Monstro sauron = new Monstro("alien", 10, 7, 4, 8);
        System.out.println(sauron.categoria);

        Arma arma = new Arma("Arma branca", 9,true,"faquinha de mesa");
        System.out.println(arma.categoria);

        Masmorra masmorra = new Masmorra("castelo","castelo lalala","abandonado", 4, 5);
        System.out.println(masmorra.categoria);


        System.out.println(heroi.getCategoria());
        System.out.println("A quantidade de habilidades é: " + heroi.getQuantidadeHabilidades());
        heroi.setPontoDeVida(19); //--> set
        System.out.println("O herói tem " + heroi.getPontoDeVida() + " pontos de vida");

    }
}