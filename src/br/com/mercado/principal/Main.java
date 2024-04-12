package br.com.mercado.principal;

import br.com.mercado.modelos.Carrinho;
import br.com.mercado.modelos.Cliente;
import br.com.mercado.modelos.Produtos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Cadastro de produtos
        Produtos sapato = new Produtos("Sapato", 150.00);
        Produtos camisa = new Produtos("Camisa", 80.00);
        Produtos calca = new Produtos("Calça", 70.00);
        Produtos meias = new Produtos("Meias", 50.00);
        Produtos camiseta = new Produtos("Camiseta", 120.00);

        Cliente cliente = new Cliente();
        Carrinho carrinho = new Carrinho();

        Map<Integer, Produtos> mapProd = new HashMap<>();
        mapProd.put(1, sapato);
        mapProd.put(2, camisa);
        mapProd.put(3, calca);
        mapProd.put(4, meias);
        mapProd.put(5, camiseta);

        cliente.setCarrinho(carrinho);
        boolean aux1 = false;
        while(!aux1){
            System.out.print("Digite o limite do cartão: ");
            double limiteDoCartão = scan.nextDouble();
            cliente.setLimiteDoCartao(limiteDoCartão);

            System.out.println("O que você quer comprar?: ");

            int aux2 = 1;

            while (aux2 != 0) {

                    System.out.println("Digite o ID do produto para adicionar ao carrinho: ");
                    System.out.println("Produtos: ");
                    for (int i = 1; i <= mapProd.size(); i++) {
                        System.out.println("Produto: ID: " + i + " -----> " + mapProd.get(i));
                    }

                    int id = scan.nextInt();
                    switch (id) {
                        case 1:
                            System.out.println("Quantos produtos será adicionado?");
                            int qtd1 = scan.nextInt();
                            carrinho.adicionaProd(qtd1, mapProd.get(1));
                            break;
                        case 2:
                            System.out.println("Quantos produtos será adicionado?");
                            int qtd2 = scan.nextInt();
                            carrinho.adicionaProd(qtd2, mapProd.get(2));
                            break;
                        case 3:
                            System.out.println("Quantos produtos será adicionado?");
                            int qtd3 = scan.nextInt();
                            carrinho.adicionaProd(qtd3, mapProd.get(3));
                            break;
                        case 4:
                            System.out.println("Quantos produtos será adicionado?");
                            int qtd4 = scan.nextInt();
                            carrinho.adicionaProd(qtd4, mapProd.get(4));
                            break;
                        case 5:
                            System.out.println("Quantos produtos será adicionado?");
                            int qtd5 = scan.nextInt();
                            carrinho.adicionaProd(qtd5, mapProd.get(5));
                            break;
                        case 0:
                            System.out.println("Produtos adicionados!");
                            aux2 = 0;
                            break;
                        default:
                            System.out.println("Digite um valor válido");
                    }
            }
            carrinho.exibeCarrinho();

            System.out.println("Efetuar o pagamento? ");
            String conf = scan.next();

            if( conf.equals("s") || conf.equals("S")){
                aux1 = cliente.pagar();
            } else {
                System.out.println("----------------------------------------------------------");
                System.out.println("Pagamento não efetuado! Volte sempre!");
                System.out.println("----------------------------------------------------------");
                aux1 = true;
            }


        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Pagamento efetuado com sucesso! Obrigado pela preferência!");
        System.out.println("----------------------------------------------------------");
    }
}
