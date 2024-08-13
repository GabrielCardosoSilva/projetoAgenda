package agenda.entities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AgendaAyla {
    private Map<String, Contato> contatos;

    public AgendaAyla(){
        contatos =  new HashMap<>();
    }

    public void salvarDados(){
        //TODO: salvar os dados do contato
    }

    public void recuperarDados(){
        //TODO: recuperar os dados dos contatos
    }

    public boolean cadastrarContato(String nome, int dia, int mes){
        //TODO: cadastrar contato
        return false;
    }

    public Collection<Contato> pesquisaAniversario(int dia, int mes){
        //TODO: pesquisa o aniversario de alguem e retorna uma lista de contatos
        return null;
    }

    public boolean removerContato(String nome){
        //TODO: remove contato krai
        return false;
    }


}
