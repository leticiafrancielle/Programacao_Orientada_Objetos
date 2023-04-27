import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro;

    public Grupo() {
        this.herois = new ArrayList<>();
    }

    public void adicionarHeroi(Heroi heroi) {
        for (int i = 0; i < herois.size(); i++) {
            if (heroi.getNome().equals(herois.get(i).getNome())) {
                System.out.println("O herói " + heroi.getNome() + " já está no grupo!");
                return;
            }
        }
        herois.add(heroi);
        System.out.println("O herói " + heroi.getNome() + " foi adicionado ao grupo!");
        this.totalMoedasDeOuro = totalMoedasDeOuro + heroi.getQuantidadeMoedasDeOuro();
    }

    public void removerHeroi(int idHeroi) {
        for (int i = 0; i < herois.size(); i++) {
            if (herois.get(i).getId() == idHeroi) {
                this.totalMoedasDeOuro = totalMoedasDeOuro - herois.get(i).getQuantidadeMoedasDeOuro();
                System.out.println("O herói " + herois.get(i).getNome() + " foi removido do grupo!");
                herois.remove(i);
                return;
            }
        }
    }
    public int getTotalMoedasDeOuro () {
        return totalMoedasDeOuro;
    }

    public void setTotalMoedasDeOuro ( int totalMoedasDeOuro){
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }
}
