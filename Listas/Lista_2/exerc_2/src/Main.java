import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadedeHabitantes;
        int quantidadeFilhos;
        int contador = 0;
        double salario;
        double somatorioSalarios = 0.0;
        double somatorioFilhos = 0.0;
        double maiorSalario = 0.0;
        System.out.println("Quantos habitantes vão realizar a pesquisa ?");
        quantidadedeHabitantes = scanner.nextInt();

        while(contador < quantidadedeHabitantes) {
            System.out.println(" Digite o salário do cidadão: ");
            salario = scanner.nextInt();

            System.out.println("Número de filhos do cidadão: ");
            quantidadeFilhos = scanner.nextInt();

            somatorioFilhos = somatorioFilhos + quantidadeFilhos;

            if(salario > maiorSalario) {
                maiorSalario = salario;
            }
            somatorioSalarios = somatorioSalarios + salario;
            contador++;
        }
        double mediaSalarial = somatorioSalarios / quantidadedeHabitantes;
        double mediaFilhos = somatorioFilhos / quantidadedeHabitantes;
        System.out.println("A média salarial da cidade é: " + mediaSalarial );
        System.out.println("A média de filhos por habitante é: " + mediaFilhos);
        System.out.println("O maior salário é: " + maiorSalario);
    }
}
