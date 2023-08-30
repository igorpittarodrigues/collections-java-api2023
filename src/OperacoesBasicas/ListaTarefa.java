package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public  void removerTarefa(String descricao){
        List<Tarefa> tarefaRemove= new ArrayList<>();

        for(Tarefa t : tarefaList ){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemove.add(t);
            }

        }

           tarefaList.removeAll(tarefaRemove);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterTarefas(){
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {


        ListaTarefa listaTarefa=new ListaTarefa();

        listaTarefa.adicionarTarefa("Lista 1");
        listaTarefa.adicionarTarefa("Lista 1");
        listaTarefa.adicionarTarefa("Lista 2");
        System.out.println("Total de lista: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Lista 2");
        System.out.println("Total de lista: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterTarefas();

    }













        }







