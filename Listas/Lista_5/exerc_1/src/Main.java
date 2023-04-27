public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();

        grupo.adicionarHeroi(new Heroi(1, "Capitão América", 70));
        grupo.adicionarHeroi(new Heroi(2, "Gavião Arqueiro", 120));
        grupo.adicionarHeroi(new Heroi(3, "Homem de Ferro", 150));
        grupo.adicionarHeroi(new Heroi(3, "Homem de Ferro", 150));

        grupo.removerHeroi(1);

        System.out.println("O total de moedas do grupo é: " + grupo.getTotalMoedasDeOuro());
    }
}