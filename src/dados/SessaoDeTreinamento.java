package dados;

public class SessaoDeTreinamento {
    private int experiencia;
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorDeFutebol jogador) {
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();

        System.out.println("Experiência inicial: "+jogador.getExperiencia());
        jogador.setExperiencia(jogador.getExperiencia()+1);
        System.out.println("Experiência final: "+jogador.getExperiencia());
    }
}
