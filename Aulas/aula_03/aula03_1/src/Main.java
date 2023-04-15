public class Main {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "letícia";
        estudante.idade = 18;
        estudante.curso = "Programação";
        estudante.ondeEstuda = "IFSP";
        estudante.estaEmpregado = false;


        Professor professor = new Professor();
        professor.nome = "mateus";
        professor.materiaQueEnsina = "Programação";
        professor.numeroIdentificacao = 10;

        System.out.println(estudante.nome);
        System.out.println("você tem " + estudante.idade + " anos");
        System.out.println("você está no curso de " + estudante.curso);
    }
}