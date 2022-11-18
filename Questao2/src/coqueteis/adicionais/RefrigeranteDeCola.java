package coqueteis.adicionais;

import coqueteis.principais.Produto;

public class RefrigeranteDeCola extends ProdutoDecorator{

    public RefrigeranteDeCola(Produto produto) {
        super(produto);
    }
    
    @Override
    public String retornaNome() {
        return this.produto.retornaNome() + " com refrigerante de cola";
    }

    @Override
    public Double retornaPreco() {
        return this.produto.retornaPreco() + 8.00;
    }


}
