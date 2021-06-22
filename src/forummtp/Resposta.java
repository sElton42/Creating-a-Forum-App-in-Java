/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forummtp;

/**
 *
 * AUTORES: ELTON SOARES & SÁVIO VENTURA
 */
public class Resposta {
    private String conteudo;

    public Resposta(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return conteudo;
    }
    
    
    
}
