/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forummtp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * AUTORES: ELTON SOARES & SÁVIO VENTURA
 */
public class ForumMTP {

    public static ArrayList <Usuario> listaUsuarios = new ArrayList();
    public static ArrayList <Topico> listaTopicos = new ArrayList();

    public static void main(String[] args) {
        Gerenciadores.importarBDUser("Usuarios.txt", listaUsuarios);
        Gerenciadores.importarBDTopic("Topicos.txt", listaTopicos);
        
         new Login().setVisible(true);
    }
    
}
