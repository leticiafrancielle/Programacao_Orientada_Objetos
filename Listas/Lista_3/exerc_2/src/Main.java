public class Main {
    public static void main(String[] args){
        Musica musica01 = new Musica();
        musica01.nome = "Kill Bill";
        musica01.duracaoEmSegundos = 153 ;
        musica01.popularidade = 790000;
        musica01.genero = "R&B";

        Musica musica02 = new Musica();
        musica02.nome = "Snooze";
        musica02.duracaoEmSegundos = 201 ;
        musica02.popularidade = 800000;
        musica02.genero = "R&B";

        Musica musica03 = new Musica();
        musica03.nome = "Low";
        musica03.duracaoEmSegundos = 181 ;
        musica03.popularidade = 187000;
        musica03.genero = "R&B";

        Musica musica04 = new Musica();
        musica04.nome = "Nobody Gets Me";
        musica04.duracaoEmSegundos = 180 ;
        musica04.popularidade = 205000;
        musica04.genero = "R&B";

        Album album = new Album();
        album.nome = "SOS";
        album.nomeArtista = "SZA";
        album.musicas.add(musica01);
        album.musicas.add(musica02);
        album.musicas.add(musica03);
        album.musicas.add(musica04);

        Musica musicaMaiorPopularidade = album.getMusicaMaiorPopularidade();
        Musica musicaMenorDuracao = album.getMusicaMenorDuracao();

        System.out.println("A música com maior popularidade é: " + musicaMaiorPopularidade.nome);
        System.out.println("A música com menor duração é: " + musicaMenorDuracao.nome);

    }
}