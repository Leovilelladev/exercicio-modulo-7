/**
 * Representa um contrabaixo e algumas ações básicas do instrumento.
 */
public class Contrabaixo {
    private String marca;
    private String cor;
    private int numeroDeCordas;
    private boolean afinado;

    public Contrabaixo(String marca, String cor, int numeroDeCordas) {
        this.marca = marca;
        this.cor = cor;
        this.numeroDeCordas = numeroDeCordas;
        this.afinado = false;
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
