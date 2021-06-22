/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forummtp;

import java.util.ArrayList;

/**
 *
 * AUTORES: ELTON SOARES & SÁVIO VENTURA
 */
public class Usuario {
    private String nome, user, email;
    private String senha;
    private int tpcsCriado, respostasDadas;

    public Usuario(String nome, String user, String email, String senha) {
        this.nome = nome;
        this.user = user;
        this.email = email;
        this.senha = senha;
        this.tpcsCriado = 0;
        this.respostasDadas = 0;
    }
    
    public Usuario(String nome, String user, String email, String senha, int tpcsCriado, int respostasDadas) {
        this.nome = nome;
        this.user = user;
        this.email = email;
        this.senha = senha;
        this.tpcsCriado = tpcsCriado;
        this.respostasDadas = respostasDadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void ContadorTpc(){
        tpcsCriado++;
    }
    
    public void ContadorRespostas(){
        respostasDadas++;
    }

    public String getTpcsCriado() {
        return Integer.toString(tpcsCriado);
    }

    public void setTpcsCriado(int tpcsCriado) {
        this.tpcsCriado = tpcsCriado;
    }

    public String getRespostasDadas() {
        return Integer.toString(respostasDadas);
    }

    public void setRespostasDadas(int respostasDadas) {
        this.respostasDadas = respostasDadas;
    }
    
    @Override
    public String toString() {
        return nome + ";" + user + ";" + email + ";" + senha + ";" + tpcsCriado + ";" + respostasDadas;
    }
    
    
    
    
}
