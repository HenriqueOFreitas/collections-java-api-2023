package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro livro : livroList) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro livro : livroList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalo.add(livro);
                }
            }
        }

        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroEncontrado = null;

        if(!livroList.isEmpty()) {
            for(Livro livro : livroList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = livro;
                    break;
                }
            }
        }

        return livroEncontrado;
    }
}
