package coqueteis.adicionais;

import coqueteis.principais.Produto;

public class Acucar extends ProdutoDecorator {

    public Acucar(Produto produto) {
        super(produto);
    }

    @Override
    public String retornaNome() {
        return this.produto.retornaNome() + " mais Açucar";
    }

    @Override
    public Double retornaPreco() {
        return this.produto.retornaPreco() + 2.5;
    }

    
    
}
