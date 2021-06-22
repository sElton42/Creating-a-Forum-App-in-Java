/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forummtp;

import static forummtp.ForumMTP.listaTopicos;
import static forummtp.ForumMTP.listaUsuarios;
import static forummtp.VisualizarTopico.listaTopic;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * AUTORES: ELTON SOARES & SÁVIO VENTURA
 */
public class Gerenciadores {
    
    public static void RemovedorUser(Usuario user){
            listaUsuarios.remove(user);
        }
        
        public static void RemovedorTopico(Topico t){
            listaTopicos.remove(t);
        }
    
        public static void escreverArquivoUsuarios(Usuario userCriado) {
            try{
                File arquivo = new File("Usuarios.txt");
                arquivo.createNewFile();
                FileWriter fileWriter = new FileWriter(arquivo, true);
                PrintWriter writer = new PrintWriter(fileWriter);
                writer.println(userCriado);
                writer.flush();
                writer.close();
            }
            catch (IOException excecaoCriacaoArquivo){
                System.out.printf("\nExceção: %s\n", excecaoCriacaoArquivo);
            }
    }
        
        public static void escreverArquivoUsuariosFalse(Usuario userCriado) {
            try{
                File arquivo = new File("Usuarios.txt");
                arquivo.createNewFile();
                FileWriter fileWriter = new FileWriter(arquivo, false);
                PrintWriter writer = new PrintWriter(fileWriter);
                writer.println(userCriado);
                writer.flush();
                writer.close();
            }
            catch (IOException excecaoCriacaoArquivo){
                System.out.printf("\nExceção: %s\n", excecaoCriacaoArquivo);
            }
    }
        
        public static void escreverArquivoTopicos(Topico topicoCriado) {
            try{
                File arquivo = new File("Topicos.txt");
                arquivo.createNewFile();
                FileWriter fileWriter = new FileWriter(arquivo, true);
                PrintWriter writer = new PrintWriter(fileWriter);
                writer.println(topicoCriado);
                writer.flush();
                writer.close();
            }
            catch (IOException excecaoCriacaoArquivo){
                System.out.printf("\nExceção: %s\n", excecaoCriacaoArquivo);
            }
    }
        
        public static void escreverArquivoTopicosFalse(Topico topicoCriado) {
            try{
                File arquivo = new File("Topicos.txt");
                arquivo.createNewFile();
                FileWriter fileWriter = new FileWriter(arquivo, false);
                PrintWriter writer = new PrintWriter(fileWriter);
                writer.println(topicoCriado);
                writer.flush();
                writer.close();
            }
            catch (IOException excecaoCriacaoArquivo){
                System.out.printf("\nExceção: %s\n", excecaoCriacaoArquivo);
            }
    }
        
        public static void importarBDUser(String documento, ArrayList <Usuario> lista) {
            try {
            Scanner scanner = new Scanner(new File(documento)); //lê arquivo externo
            while (scanner.hasNext()) {
                try {
                    String linha = (scanner.nextLine());
                    String[] vetor = linha.split(";");
                    int contTpc = Integer.parseInt(vetor[4]);
                    int contRes = Integer.parseInt(vetor[5]);
                    Usuario a = new Usuario(vetor[0], vetor[1], vetor[2], vetor[3], contTpc, contRes);
                    lista.add(a);
                    }
                catch (NoSuchElementException excecaoElemento)  { //trata erro
                    System.err.println("Arquivo com formato incorreto");
                    scanner.close();
                    System.exit(1);
                    }
                }
            } catch (FileNotFoundException e) { //trata erro
            System.err.println("Arquivo não encontrado");
            }
    }
        
                public static void importarBDTopic(String documento, ArrayList <Topico> lista) {
            try {
            Scanner scanner = new Scanner(new File(documento)); //lê arquivo externo
            while (scanner.hasNext()) {
                try {
                    String linha = (scanner.nextLine());
                    String[] vetor = linha.split("/");
                    String[] gambiarra = linha.split("@");
                    
                    StringBuilder sb = new StringBuilder();
                    for(int i = 1; i<gambiarra.length;i++){
                        sb.append(gambiarra[i]);
                    }
                    
                    String recup = String.valueOf(sb);
                    
                    Resposta res = new Resposta(recup);
                    
                    Topico t = new Topico(vetor[0], vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], vetor[6]);
                    
                    t.addResp(res);
                    
                    lista.add(t);
                    }
                catch (NoSuchElementException excecaoElemento)  { //trata erro
                    System.err.println("Arquivo com formato incorreto");
                    scanner.close();
                    System.exit(1);
                    }
                }
            } catch (FileNotFoundException e) { //trata erro
            System.err.println("Arquivo não encontrado");
            }
    }
}
