public class Main {

    public static void main(String[] args) {
        Musica musica01 = new Musica("Kill Bill","R&B",153, 790000);
        Musica musica02 = new Musica("Snooze","R&B",201,800000);
        Musica musica03 = new Musica("Low","R&B",181,187000);
        Musica musica04 = new Musica("Nobody Gets Me", "R&B",180,205000);

        Album album = new Album("SOS", "Sza");
        album.getMusicas().add(musica01);
        album.getMusicas().add(musica02);
        album.getMusicas().add(musica03);
        album.getMusicas().add(musica04);

        Musica musicaMaiorPopularidade = album.getMusicaMaiorPopularidade();
        Musica musicaMenorDuracao = album.getMusicaMenorDuracao();

        System.out.println("A música com maior popularidade é: " + musicaMaiorPopularidade.getNome());
        System.out.println("A música com menor duração é: " + musicaMenorDuracao.getNome());
    }
}
