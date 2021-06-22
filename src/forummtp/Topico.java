/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forummtp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * AUTORES: ELTON SOARES & SÁVIO VENTURA
 */
public class Topico {
    private String titulo, conteudo;
    private String key1, key2, key3, key4, key5;
    private ArrayList <Resposta> respInseridas = new ArrayList();

    public Topico(String titulo, String conteudo, String key1, String key2, String key3, String key4, String key5) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.key1 = key1;
        this.key2 = key2;
        this.key3 = key3;
        this.key4 = key4;
        this.key5 = key5;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public ArrayList<Resposta> getRespInseridas() {
        return respInseridas;
    }

    public void setRespInseridas(ArrayList<Resposta> respInseridas) {
        this.respInseridas = respInseridas;
    }
    
    public void addResp(Resposta resp){
        respInseridas.add(resp);
    }
    
    public String retornoRespIn(){
        String result = "";
        for(int i=0;i<respInseridas.size();i++){
            result = result + respInseridas.get(i);
        }
        return result;
    }
    
    public String retorno2(){
        String result = retornoRespIn();
        String vetor[] = result.split("#");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<vetor.length;i++){
            sb.append(vetor[i]+"\n");
        }
        
        String recup = String.valueOf(sb);
        return recup;
    }
    
    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public String getKey3() {
        return key3;
    }

    public void setKey3(String key3) {
        this.key3 = key3;
    }

    public String getKey4() {
        return key4;
    }

    public void setKey4(String key4) {
        this.key4 = key4;
    }

    public String getKey5() {
        return key5;
    }

    public void setKey5(String key5) {
        this.key5 = key5;
    }
    
    
    
    @Override
    public String toString() {
        return titulo + "/" + conteudo + "/" + key1 + "/" + key2 + "/" + key3 + "/" + key4 + "/" + key5 + "/" + "@" + retornoRespIn();
    }
    
    
    
    
}
