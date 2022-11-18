package coqueteis.principais;

public class Rum implements Produto{
    
    private String nome = "Rum";
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
