import java.util.Scanner;

public class Variaveis {
    public static void main(String[]args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo! Digite seu nome completo:");
        String nome = scanner.nextLine();
        System.out.println("nome"+nome);

        System.out.println("Agora digite o seu cpf:");
        double cpf = scanner.nextDouble();


        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("idade"+idade);

        System.out.println("Digite sua altura:");

        double altura = scanner.nextDouble();
        System.out.println("altura"+altura);
        scanner.nextLine();

        System.out.println("Digite seu estado civil:");

        String texto = scanner.nextLine();

        System.out.println("Muito obrigado");


        scanner.close();

    }
}
