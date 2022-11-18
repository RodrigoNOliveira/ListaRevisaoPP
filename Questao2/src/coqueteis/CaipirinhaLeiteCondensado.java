package coqueteis;

public class CaipirinhaLeiteCondensado extends ProdutoDecorator{

    public CaipirinhaLeiteCondensado(Produto produto) {
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
