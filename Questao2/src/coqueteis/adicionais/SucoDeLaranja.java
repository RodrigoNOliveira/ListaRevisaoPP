package coqueteis.adicionais;

import coqueteis.principais.Produto;

public class SucoDeLaranja extends ProdutoDecorator{

    public SucoDeLaranja(Produto produto) {
        super(produto);
    }

    @Override
    public String retornaNome() {
        return this.produto.retornaNome() + " com suco de laranja";
    }

    @Override
    public Double retornaPreco() {
        return this.produto.retornaPreco() + 6.00;
    }

    
}
