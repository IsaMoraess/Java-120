/*Cria um jogo de adivinhação usando gets e sets. Um primeiro jogador entra 
com um número, depois um segundo jogador terá 5 chances (por exemplo) 
para acertar o número. Os resultados possíveis serão os seguintes:
- Se o palpite apresentado baixo, o programa deve informar: TENTE UM NÚMERO MAIOR.
- Se o palpite for alto, o programa deve informar: TENTE UM NÚMERO MENOR.
- Se for exato deve informar: PARABÉNS!!! ADVINHOU!!!
- Se ultrapassar as 5 tentativas, o programa deve informar: VOCÊ PERDEU!!!! */

public class JogoAdivinhacao {
    private int ArmazeNumeroSecreto;

    //definir o número secreto
    public void setArmazeNumeroSecreto(int ArmazeNumeroSecreto) {
        this.ArmazeNumeroSecreto = ArmazeNumeroSecreto;
    }
    //obter o número secreto 
    public int getArmazeNumeroSecreto() {
        return ArmazeNumeroSecreto;
    }

    //verificar a tentativa
    public String verificarTentativa(int palpite) {
        if (palpite < ArmazeNumeroSecreto) {
            return "TENTE UM NÚMERO MAIOR.";
        } else if (palpite > ArmazeNumeroSecreto) {
            return "TENTE UM NÚMERO MENOR.";
        } else {
            return "PARABÉNS!!! ADVINHOU!!!";
        }
    }
}
