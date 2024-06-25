package view; // define o pacote onde a classe está localizada

import java.util.Scanner; // importa a classe Scanner para leitura de dados do console

public class Console {
    // declaração de um objeto Scanner estático para ser utilizado em toda a classe
    private static Scanner scanner = new Scanner(System.in);

    // método estático para ler uma string do console
    public static String lerString(String mensagem) {
        System.out.print(mensagem + ": "); // Exibe a mensagem para o usuário
        return scanner.nextLine(); // Lê uma linha completa de entrada do usuário
    }

    // método estático para ler um inteiro do console
    public static int lerInt(String mensagem) {
        System.out.print(mensagem + ": "); // Exibe a mensagem para o usuário
        return scanner.nextInt(); // Lê um inteiro da entrada do usuário
    }
}
