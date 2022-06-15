package modelo;

import javafx.beans.property.SimpleStringProperty;

public class ListaParticipantes {

    private SimpleStringProperty nome;
    private  SimpleStringProperty cpf;

    public ListaParticipantes() {
    }


    public ListaParticipantes(String nome, String cpf) {
        this.nome = new SimpleStringProperty(nome);
        this.cpf = new SimpleStringProperty(cpf);
    }
    

    public void setNome(String nome){

        this.nome.set(nome);

    }

    public String getNome(){

        return nome.get();

    }

    public void setCpf(String cpf){

        this.cpf.set(cpf);

    }

    public String getCpf(){

        return cpf.get();

    }

}

