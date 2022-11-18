package coqueteis.adicionais;

import coqueteis.principais.Produto;

public class Iogurte extends ProdutoDecorator{

    public Iogurte(Produto produto) {
        super(produto);
    }


    public String retornaNome() {
        return this.produto.retornaNome() + " com Iogurte";
    }

    @Override
    public Double retornaPreco() {
        return this.produto.retornaPreco() + 5.00;
    }

    
    
}
