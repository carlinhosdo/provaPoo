package modelo;

import javafx.beans.property.SimpleStringProperty;

public class ListaParticipantes {

    private SimpleStringProperty nome = new SimpleStringProperty();
    private  SimpleStringProperty cpf = new SimpleStringProperty();

    public ListaParticipantes() {
    }


    public ListaParticipantes(String nome, String cpf) {
        this.nome.set(nome);
        this.cpf.set(cpf);
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

