package coqueteis.principais;

public class Vodka implements Produto{
    
    private String nome = "Vodka";
    private Double preco = 8.00;


    @Override
    public String retornaNome() {
        return this.nome;
    }

    @Override
    public Double retornaPreco() {
        return this.preco;
    }
}
