package principal;

import dados.JogadorDeFutebol;
import dados.SessaoDeTreinamento;

public class Main {

    public static void main(String[] args) {
        JogadorDeFutebol Ronaldinho = new JogadorDeFutebol();
        JogadorDeFutebol Garrincha = new JogadorDeFutebol();

        Ronaldinho.setNome("Ronaldinho");
        Ronaldinho.setEnergia(100);

        Garrincha.setNome("Garrinhcha");
        Garrincha.setEnergia(100);

        SessaoDeTreinamento treino = new SessaoDeTreinamento();

        System.out.println(Ronaldinho.getNome());
        treino.treinarA(Ronaldinho);

        System.out.println(Garrincha.getNome());
        treino.treinarA(Garrincha);
    }
}
