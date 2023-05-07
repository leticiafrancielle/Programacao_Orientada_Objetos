public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        System.out.println("Área do quadrado: " + quadrado.calcularArea(16,4));

        Triangulo triangulo = new Triangulo();
        System.out.println("Área do triângulo: " + triangulo.calcularArea(5,3));
    }
}
