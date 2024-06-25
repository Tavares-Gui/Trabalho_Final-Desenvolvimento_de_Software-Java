package model.entities;

import java.io.Serializable;

public class Show implements Serializable {
    private String nomeTurne;
    private String cantor;

    public Show(String nomeTurne, String cantor) {
        this.nomeTurne = nomeTurne;
        this.cantor = cantor;
    }

    public String getNomeTurne() {
        return nomeTurne;
    }

    public void setNomeTurne(String nomeTurne) {
        this.nomeTurne = nomeTurne;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String exibirDados() {
        return "Turnê: " + nomeTurne + ", Cantor: " + cantor;
    }
}