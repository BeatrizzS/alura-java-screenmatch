import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.Recomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) throws Exception {

    Filme meuFilme = new Filme();
    meuFilme.setNome("O Poderoso chefão");
    meuFilme.setAnoLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);
    System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
    

    meuFilme.exibeFichaTecnica();
    
    meuFilme.avalia(8);
    meuFilme.avalia(5);
    meuFilme.avalia(10);

    System.out.println("Total de avaliações: " + meuFilme.gettotalAvaliacoes());
    System.out.println(meuFilme.media());
    // isso nao pode acontecer meuFilme.somaAvaliacoes = 10;
    // meuFilme.totalAvaliacoes = 1;

    System.out.println(meuFilme.media());

    //Filme.nome = "Top Gun";
    
    
    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setAnoLancamento(2000);
    lost.exibeFichaTecnica();
    lost.setTemporadas(10);
    lost.setEpPorTemporada(10);
    lost.setMinutoPorEpisodio(50);
    System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());



    Filme outroFilme = new Filme();
    outroFilme.setNome("O Poderoso chefão");
    outroFilme.setAnoLancamento(2023);
    outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());



    Recomendacao filtro = new Recomendacao();
    filtro.filtra(meuFilme);

    Episodio episodio = new Episodio();
    episodio.setNumero(1);
    episodio.setSerie(lost);
    episodio.setTotalVisualizacoes(300);
    filtro.filtra(episodio);


    Filme filmeDoPaulo = new Filme();
    filmeDoPaulo.setNome("Dogville");
    filmeDoPaulo.setDuracaoEmMinutos(200);
    filmeDoPaulo.setAnoLancamento(2003);
    filmeDoPaulo.avalia(10);
    
    }


/*
    String nome;
    double preco;
    double descontoParaPix;
    double precoFinal;
    boolean pagamentoViaPix;
    
    double pegaPrecoFinal(boolean pagamentoViaPix) {
        if (pagamentoViaPix == true) {
            double precoFinal = preco - descontoParaPix;
        } else {
            double precoFinal = preco;
        }
        
    }

    return precoFinal();


}
    */


    
}