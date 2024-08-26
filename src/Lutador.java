import java.util.Random;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private int vida;
    private int critico;
    private int forca;
    private String categoria;
    private int vitorias, derrotas, empates;


    public Lutador(String no, String na, int id, float al, float pe, int hp, int cri, int fo, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVida(hp);
        this.setCritico(cri);
        this.setForca(fo);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    public void apresentar() {
        System.out.println("-------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + nome);
        System.out.println("Diretamente de: " + nacionalidade);
        System.out.println("com " + idade + " anos");
        System.out.println("De " + altura + "m de altura");
        System.out.println("Pesando " + peso + "Kg");
        System.out.println("Ganhou: " + vitorias);
        System.out.println("Perdeu: " + derrotas);
        System.out.println("Empatou: " + getEmpates());
        System.out.println("Vida: " + vida);
        System.out.println("Crítico: " + critico);
        System.out.println("Força: " + forca);
    }

    public void status() {
        System.out.println(nome + " tem " + vida + " pontos de vida.");
        System.out.println("Vitórias: " + this.getVitorias() + " vezes");
        System.out.println("Derrotas: " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void atacar(Lutador oponente) {
        Random random = new Random();
        int dano = this.forca;

        if (random.nextInt(100) < critico) {
            dano *= 2;
            System.out.println(nome + " acertou um golpe crítico! (" + dano + ")");
        } else {
            System.out.println(nome + " acertou um golpe. (" + dano + ")");
        }

        oponente.vida -= dano;
        if (oponente.vida < 0) {
            oponente.vida = 0;
        }
        System.out.println(oponente.nome + " está com " + oponente.vida + " de vida.");
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if
        (getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if
        (getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if
        (getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public void defender() {
        System.out.println(nome + " defendeu.");
    }

    public void ganharLuta() {
        this.setVitorias(getVitorias() + +1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + +1);
    }

    public void empatarLuta() {
        this.setEmpates(getEmpates() + +1);
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    String getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int hp) {
        this.vida = hp;
    }

    public int getCritico() {
        return critico;
    }

    public void setCritico(int cri) {
        this.critico = cri;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int fo) {
        this.forca = fo;
    }
}
