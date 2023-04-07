import java.util.Scanner;

public class Main {
    public static String categoriaNadador(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18) {
            return "Adulto" ;
        } else {
            return "Idade inválida...";
        }
    }
}
