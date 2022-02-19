package br.ufpb.dcx.aps.atividades.atv05;

import java.util.HashMap;
import java.util.Map;

public class Formulario {

    private String titulo;
    private Map<String,Campo> campos;

    public Formulario() {
        this.titulo = "";
        campos = new HashMap<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String novoTitutlo) {
        this.titulo = novoTitutlo;
    }

    public void addCampo(Campo campo) {
        if(campos.get(campo.getId()) != null) {
            throw new RuntimeException("Já existe um campo com este id:'"+campo.getId()+"'");
        }
        this.campos.put(campo.getId(), campo);

    }

    public Campo getCampo(String id) {
        if(this.campos.get(id) == null) {
            return null;
        }
        return  this.campos.get(id);
    }

    public Map<String, Campo> getCampos() {
        return this.campos;
    }
}
