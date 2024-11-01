
import java.util.Scanner;

interface GeradorSenha {
    String gerarSenha(int tamanho);
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de senha:");
        System.out.println("1 - Apenas números");
        System.out.println("2 - Apenas letras minúsculas");
        System.out.println("3 - Letras minúsculas e números");
        System.out.println("4 - Letras maiúsculas, minúsculas e números");
        System.out.println("5 - Letras maiúsculas, minúsculas, números e símbolos ($, &, #, @, _)");

        System.out.print("Escolha o tipo de senha desejado (1-5): ");
        int tipo = scanner.nextInt();

        System.out.print("Digite o tamanho da senha desejada: ");
        int tamanho = scanner.nextInt();

        GeradorSenha gerador = null;
        switch (tipo) {
            case 1 -> gerador = new GeradorNumeros();
            case 2 -> gerador = new GeradorLetrasMinusculas();
            case 3 -> gerador = new GeradorLetrasMinusculasNumeros();
            case 4 -> gerador = new GeradorMaiusculasMinusculasNumeros();
            case 5 -> gerador = new GeradorCompleto();
            default -> System.out.println("Opção inválida.");
        }

        if (gerador != null) {
            String senha = gerador.gerarSenha(tamanho);
            System.out.println("Sua senha gerada é: " + senha);
        }
        scanner.close();
    }
}