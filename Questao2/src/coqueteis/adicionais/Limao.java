package coqueteis.adicionais;

import coqueteis.principais.Produto;

public class Limao extends ProdutoDecorator{

    public Limao(Produto produto) {
        super(produto);
    }

    @Override
    public String retornaNome() {
        return this.produto.retornaNome() + " com limão";
    }

    @Override
    public Double retornaPreco() {
        return this.produto.retornaPreco() + 3.00;
    }

    
}
