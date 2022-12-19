    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jjsco
 */
public class ProdutosPedidos {
    int id;
    String itemPedido;
    int quantidade;
    float preco;
    float precoTotal;
    String status;
    int idProduto;
    int idPedidos;
    int idCliente;

    public ProdutosPedidos(int id, String itemPedido, int quantidade, float preco, int idProduto, int idPedidos, int idCliente) {
        this.id = id;
        this.itemPedido = itemPedido;
        this.quantidade = quantidade;
        this.preco = preco;
        this.idProduto = idProduto;
        this.idPedidos = idPedidos;
        this.idCliente = idCliente;
    }

    public ProdutosPedidos(float precoTotal, int idProduto, int idPedidos, int idCliente) {
        this.precoTotal = precoTotal;
        this.idProduto = idProduto;
        this.idPedidos = idPedidos;
        this.idCliente = idCliente;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(String itemPedido) {
        this.itemPedido = itemPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdPedidos() {
        return idPedidos;
    }

    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    
    
    
}
