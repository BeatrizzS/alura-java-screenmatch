package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;
    
    public int gettotalAvaliacoes() {
        return totalAvaliacoes;
    }

    
    public String getNome() {
        return nome;
    }


    public int getAnoLancamento() {
        return anoLancamento;
    }


    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }


    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double media(){
        return somaAvaliacoes/totalAvaliacoes;
    }

    
}
