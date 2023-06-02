import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();

        pokedex.adicionarPokemon(new Pokemon("1sqi", "Squirtle", "água"));
        pokedex.adicionarPokemon(new Pokemon("2bul", "Bulbasaur", "planta"));
        pokedex.adicionarPokemon(new Pokemon("3zek", "Zekrom", "dragão/elétrico"));
        pokedex.adicionarPokemon(new Pokemon("4cha", "Charmander", "fogo"));
    }
}