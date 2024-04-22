/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaon
 */
public class Item {
    private int qte;
    private Produtos produto;

    public Item(int qte, Produtos produto) {
        this.setQte(qte);
        this.setProduto(produto);
    }
    
    int obterValorTotal() {
        return this.qte * this.produto.getValor();
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }
    
    
}
