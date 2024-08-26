import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int turno = 1;

            while (desafiado.estaVivo() && desafiante.estaVivo()) {
                System.out.println("~~~~~~ Turno " + turno + " ~~~~~~");

                if (aleatorio.nextBoolean()) {
                    desafiado.atacar(desafiante);
                } else {
                    desafiado.defender();
                }

                if (desafiante.estaVivo()) {
                    if (aleatorio.nextBoolean()) {
                        desafiante.atacar(desafiado);
                    } else {
                        desafiante.defender();
                    }
                }

                turno++;
            }

            System.out.println("===== RESULTADO DA LUTA =====");
            if (desafiado.estaVivo()) {
                System.out.println("Vitória do " + desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
            } else {
                System.out.println("Vitória do " + desafiante.getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
            }
            System.out.println("===============");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
