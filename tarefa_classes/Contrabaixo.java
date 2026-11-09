/**
 * Representa um contrabaixo e algumas ações básicas do instrumento.
 */
public class Contrabaixo {
    private String marca;
    private String modelo;
    private String cor;
    private String coresDisponiveis;
    private int numeroDeCordas;
    private String materialDoCorpo;
    private String materialDoBraco;
    private String escala;
    private String captacao;
    private String equalizacao;
    private String ponte;
    private boolean afinado;

    public Contrabaixo() {
        this.marca = "Tagima";
        this.modelo = "Millenium Bass 4";
        this.cor = "Sunburst";
        this.coresDisponiveis = "Black, Sunburst, Natural e Olympic white";
        this.numeroDeCordas = 4;
        this.materialDoCorpo = "Basswood";
        this.materialDoBraco = "Maple com shape C";
        this.escala = "Techwood com 24 trastes e escala de 34 polegadas";
        this.captacao = "2 captadores JJ single coils cerâmicos by Tagima";
        this.equalizacao = "Ativa de 9V";
        this.ponte = "Standard high-mass";
        this.afinado = false;
    }

    public void exibirDescricao() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Cores disponíveis: " + coresDisponiveis);
        System.out.println("Número de cordas: " + numeroDeCordas);
        System.out.println("Material do corpo: " + materialDoCorpo);
        System.out.println("Material do braço: " + materialDoBraco);
        System.out.println("Escala: " + escala);
        System.out.println("Captação: " + captacao);
        System.out.println("Equalização: " + equalizacao);
        System.out.println("Ponte: " + ponte);
    }

    public void afinar() {
        afinado = true;
        System.out.println("O contrabaixo foi afinado.");
    }

    public void tocar() {
        if (afinado) {
            System.out.println("O contrabaixo está tocando.");
        } else {
            System.out.println("Afine o contrabaixo antes de tocar.");
        }
    }

    public void pararDeTocar() {
        System.out.println("O contrabaixo parou de tocar.");
    }
}
