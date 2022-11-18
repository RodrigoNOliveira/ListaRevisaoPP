package classes;

public class LivroDigital extends Produto{

    public LivroDigital(){
        setComportamentoDesc(new DescontoDigital());
    }

    @Override
    public void exibir() {
        System.out.println("Livro Digital"); 
    }
    
}
