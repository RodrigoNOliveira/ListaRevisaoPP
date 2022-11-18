package coqueteis.adicionais;

import coqueteis.principais.Produto;

public class LeiteCondensado extends ProdutoDecorator{

    public LeiteCondensado(Produto produto) {
        super(produto);

    }

    @Override
    public String retornaNome() {
 
        return this.produto.retornaNome() + " mais Leite Condensado";
    }

    @Override
    public Double retornaPreco() {

        return this.produto.retornaPreco() + 10.00;
    }

    
    
}
