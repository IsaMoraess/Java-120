import java.util.Scanner;

public class metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JogoAdivinhacao jogo = new JogoAdivinhacao();

        System.out.print("Jogador 1, defina o número secreto: ");
        jogo.setArmazeNumeroSecreto(sc.nextInt());

        // Limpar a tela (não funcional em alguns IDEs)
        System.out.println("\n".repeat(50)); // Para ocultar o número secreto

        System.out.println("Jogador 2, você tem 5 tentativas para adivinhar o número.");
        boolean acertou = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Tentativa " + (i + 1) + ": ");
            String resultado = jogo.verificarTentativa(sc.nextInt());
            System.out.println(resultado);

            if (resultado.equals("PARABÉNS!!! ADVINHOU!!!")) {
                acertou = true;
                break;
            }
        }

        if (!acertou) {
            System.out.println("VOCÊ PERDEU!!!! O número secreto era: " 
            + jogo.getArmazeNumeroSecreto());
        }
    }
}
