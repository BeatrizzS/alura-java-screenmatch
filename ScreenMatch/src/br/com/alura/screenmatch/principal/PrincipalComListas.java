package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
            Filme meuFilme = new Filme("O Poderoso chefão", 1970);
            meuFilme.avalia(9);
            Filme outroFilme = new Filme("Avatar", 2023);
            outroFilme.avalia(6);
            var filmeDoPaulo = new Filme("Dogville", 2003);
            filmeDoPaulo.avalia(10);
            Serie lost = new Serie("Lost", 2000);

            Filme f1 = filmeDoPaulo;

    ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo i: lista) {
            System.out.println(i.getNome());
            if (i instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
    }
}
