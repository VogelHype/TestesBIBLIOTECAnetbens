/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.classes;
import java.util.List;
/**
 *
 * @author Aluno TDS
 */
public class ClienteLeitor {
    
    private String nome;
    private String senha;
    private String email;
    
    
    public ClienteLeitor(String nome, String senha, String email){

        this.nome = nome;
        this.senha = senha;
        this.email = email;
       
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public String getEmail(){
        return email;
    }
    
}