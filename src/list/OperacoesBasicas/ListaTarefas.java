package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String tarefa) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(tarefa)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaDeTarefa = new ListaTarefas();

        listaDeTarefa.adicionarTarefa("Assistir a live da DIO em parceria com a Claro");
        listaDeTarefa.adicionarTarefa("Jantar ao final do dia");
        listaDeTarefa.adicionarTarefa("Limpar a mesa ao final do dia");
        listaDeTarefa.adicionarTarefa("Tarefa 1");
        listaDeTarefa.adicionarTarefa("Tarefa 1");

        System.out.println(listaDeTarefa.obterNumeroTotalTarefas());
        listaDeTarefa.obterDescricoesTarefas();

        listaDeTarefa.removerTarefa("Tarefa 1");
        System.out.println(listaDeTarefa.obterNumeroTotalTarefas());
    }
}
