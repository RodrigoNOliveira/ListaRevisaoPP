package coqueteis;

public class CaipirinhaMaisAcucar extends ProdutoDecorator {

    public CaipirinhaMaisAcucar(Produto produto) {
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
