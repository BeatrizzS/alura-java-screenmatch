package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int epPorTemporada;
    private int minutoPorEpisodio;
    public int getTemporadas() {
        return temporadas;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public int getEpPorTemporada() {
        return epPorTemporada;
    }
    public int getMinutoPorEpisodio() {
        return minutoPorEpisodio;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }
    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        this.minutoPorEpisodio = minutoPorEpisodio;
    }


    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epPorTemporada * minutoPorEpisodio;
    }
}
