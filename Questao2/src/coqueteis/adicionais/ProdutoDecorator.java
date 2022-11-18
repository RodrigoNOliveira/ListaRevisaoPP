package coqueteis.adicionais;

import coqueteis.principais.Produto;

public class ProdutoDecorator implements Produto{

    protected Produto produto;




    
    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String retornaNome() {
        return this.produto.retornaNome();
    }

    @Override
    public Double retornaPreco() {
        return this.produto.retornaPreco();
    }
    
}
