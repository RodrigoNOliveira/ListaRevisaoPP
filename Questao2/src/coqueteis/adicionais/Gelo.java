package coqueteis.adicionais;

import coqueteis.principais.Produto;

public class Gelo extends ProdutoDecorator{

    public Gelo(Produto produto) {
        super(produto);
    }
    
    @Override
    public String retornaNome() {
        return this.produto.retornaNome() + " mais gelo";
    }

    @Override
    public Double retornaPreco() {
        return this.produto.retornaPreco() + 2.00;
    }

}
