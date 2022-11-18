package coqueteis.principais;

public class Tequila implements Produto{

    private String nome = "Tequila";
    private Double preco = 12.00;


    @Override
    public String retornaNome() {
        return this.nome;
    }

    @Override
    public Double retornaPreco() {
        return this.preco;
    }
    
}
