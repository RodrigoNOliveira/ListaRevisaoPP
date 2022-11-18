package coqueteis.adicionais;

import coqueteis.principais.Produto;

public class Energetico extends ProdutoDecorator{

    public Energetico(Produto produto) {
        super(produto);
    }

    @Override
    public String retornaNome() {
        return this.produto.retornaNome() + " com energetico";
    }

    @Override
    public Double retornaPreco() {
        return this.produto.retornaPreco() + 12.00;
    }

    
    
}
