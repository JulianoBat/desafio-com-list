package br.com.mercado.modelos;

import java.util.LinkedList;
import java.util.List;

public class Carrinho {
    private int qtdTotalProd;
    private double valorTotal;
    private List<Produtos> produtos = new LinkedList<>();

    public double getValorTotal() {
        return valorTotal;
    }

    public void adicionaProd(int qtd, Produtos prod){
        this.qtdTotalProd += qtd;
        this.produtos.add(prod);
        prod.setQtd(qtd);
        this.valorTotal += prod.getValor()*qtd;
    }

    public void exibeCarrinho(){
        System.out.println("Seu carrinho: ");
        for (Produtos item : this.produtos){
            System.out.println(item.getQtd() + " -------------- " + item.getNome());
        }
        System.out.println();
        System.out.println("Total a pagar: " + this.valorTotal);
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "produtos=" + produtos +
                ", qtdTotalProd=" + qtdTotalProd +
                '}';
    }
}
