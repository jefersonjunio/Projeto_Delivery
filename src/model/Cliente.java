/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jjsco
 */
public class Cliente {
    
    /*Atributos*/
    
    int id;
    String nome;
    String cpf;
    String rua;
    String bairro;
    int numero;
    String telefone;
    String celular;
    String referencia;
    
    /*Construtores*/
    
    public Cliente(int id, String nome, String cpf, String rua, String bairro, int numero, String telefone, String celular, String referencia) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.telefone = telefone;
        this.celular = celular;
        this.referencia = referencia;
    }

    public Cliente(String nome, String cpf, String rua, String bairro, int numero, String telefone, String celular, String referencia) {
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.telefone = telefone;
        this.celular = celular;
        this.referencia = referencia;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }
    
    
    /*Getters and Setters*/
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
}
