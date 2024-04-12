package br.com.mercado.modelos;

public class Cliente {
    private double limiteDoCartao;
    private Carrinho carrinho;

    public void setLimiteDoCartao(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }


    public boolean pagar(){
        if(this.limiteDoCartao > carrinho.getValorTotal()){
            this.limiteDoCartao -= carrinho.getValorTotal();
            return true;
        } else {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Você não possui saldo o suficiente! Por favor, mude o saldo ou altere o seu carrinho");
            System.out.println("---------------------------------------------------------------------------------------");
            return false;
        }

    }
}
