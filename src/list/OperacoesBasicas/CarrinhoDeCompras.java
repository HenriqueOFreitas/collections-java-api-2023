package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = this.listaItem;

        for(Item i : this.listaItem) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }

        this.listaItem.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double totalCarrinho = 0.0;
        for(Item i : this.listaItem) {
            totalCarrinho += i.getPreco() * i.getQuantidade();
        }

        return totalCarrinho;
    }

    public void exibirItens() {
        System.out.println(listaItem);
    }
}
