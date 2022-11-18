package coqueteis.principais;

public class Caipirinha implements Produto{

    private String nome = "Caipirinha";
    private Double preco = 10.00;


    @Override
    public String retornaNome() {
        return this.nome;
    }

    @Override
    public Double retornaPreco() {
        return this.preco;
    }
    
}
