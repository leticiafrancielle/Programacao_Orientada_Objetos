public class Main {
    public static void main(String[] args) {
        Inimigo inimigo01 = new Inimigo();
        inimigo01.nome = "Morgoth";
        inimigo01.ataque = 200;
        inimigo01.defesa = 20;
        inimigo01.pontos = 70;

        Inimigo inimigo02 = new Inimigo();
        inimigo02.nome = "Glaurung";
        inimigo02.ataque = 55;
        inimigo02.defesa = 10;
        inimigo02.pontos = 40;

        Inimigo inimigo03 = new Inimigo();
        inimigo03.nome = "Sauron";
        inimigo03.ataque = 10;
        inimigo03.defesa = 5;
        inimigo03.pontos = 50;

        Heroi heroi01 = new Heroi();
        heroi01.nome = "Galadriel";
        heroi01.ataque = 300;
        heroi01.defesa = 50;
        heroi01.pontos = 100;

        Heroi heroi02 = new Heroi();
        heroi02.nome = "Gandalf";
        heroi02.ataque = 700;
        heroi02.defesa = 25;
        heroi02.pontos = 1000;

        Heroi heroi03 = new Heroi();
        heroi03.nome = "Frodo Bolseiro";
        heroi03.ataque = 400;
        heroi03.defesa = 25;
        heroi03.pontos = 1000;

        Mapa mapa = new Mapa();
        mapa.nome = "Middle Earth";
        mapa.altura = 15;
        mapa.largura = 30;
        mapa.inimigos.add(inimigo01);
        mapa.inimigos.add(inimigo02);
        mapa.inimigos.add(inimigo03);
        mapa.herois.add(heroi01);
        mapa.herois.add(heroi02);
        mapa.herois.add(heroi03);

        Inimigo inimigoMaiorAtaque = mapa.getInimigoMaiorAtaque();
        Heroi heroiMaiorAtaque = mapa.getHeroiMaiorAtaque();


        System.out.println("Inimigo " + inimigoMaiorAtaque.nome + " deu maior ataque de: " +
                "\n" + inimigoMaiorAtaque.ataque);
        System.out.println("Heroi " + heroiMaiorAtaque.nome + " deu maior ataque de: " +
                "\n" + heroiMaiorAtaque.ataque);

    }
}