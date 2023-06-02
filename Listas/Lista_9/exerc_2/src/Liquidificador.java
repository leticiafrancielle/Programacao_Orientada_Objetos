public class Liquidificador <T extends Alimento>{
    private T alimento;

    public void bater(Alimento alimento){
        System.out.println("Batendo alimento..." );
    }
    public T getAlimento() {
        return alimento;
    }

    public void setAlimento(T alimento) {
        this.alimento = alimento;
    }
}