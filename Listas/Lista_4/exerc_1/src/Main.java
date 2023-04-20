public class Main {
    public static void main(String[] args) {
        Inimigo inimigo01 = new Inimigo("Morgoth", 2000,20,70);
        Inimigo inimigo02 = new Inimigo("Glaurung",555,10,40);
        Inimigo inimigo03 = new Inimigo("Sauron",10,5,50);

        Heroi heroi01 = new Heroi("Galadriel",400,50,100);
        Heroi heroi02 = new Heroi("Gandalf",7000,25,1000);
        Heroi heroi03 = new Heroi("Frodo Bolseiro",400,25,1000);

        Mapa mapa = new Mapa("Middle Earth", 15,30);
        mapa.getInimigos().add(inimigo01);
        mapa.getInimigos().add(inimigo02);
        mapa.getInimigos().add(inimigo03);
        mapa.getHerois().add(heroi01);
        mapa.getHerois().add(heroi02);
        mapa.getHerois().add(heroi03);

        Inimigo inimigoMaiorAtaque = mapa.getInimigoMaiorAtaque();
        Heroi heroiMaiorAtaque = mapa.getHeroiMaiorAtaque();

        System.out.println("Inimigo " + inimigoMaiorAtaque.getNome() + " deu maior ataque de: " +
                "\n" + inimigoMaiorAtaque.getAtaque());
        System.out.println("Heroi " + heroiMaiorAtaque.getNome() + " deu maior ataque de: " +
                "\n" + heroiMaiorAtaque.getAtaque());
    }
}