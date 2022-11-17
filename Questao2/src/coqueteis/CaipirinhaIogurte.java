package coqueteis;

public class CaipirinhaIogurte extends ProdutoDecoretor{

    public CaipirinhaIogurte(Produto produto) {
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
