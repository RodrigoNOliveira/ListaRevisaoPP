package coqueteis.principais;

public class Whisky implements Produto{
    
    private String nome = "Whisky";
    private Double preco = 15.00;


    @Override
    public String retornaNome() {
        return this.nome;
    }

    @Override
    public Double retornaPreco() {
        return this.preco;
    }
}
