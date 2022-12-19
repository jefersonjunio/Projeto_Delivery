/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jjsco
 */
public class Produto {
    int id;
    float preco;
    String nome;

    public Produto(int id, float preco, String nome) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
       
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(float preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  
    
}
