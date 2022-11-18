package classes;

public class LivroFisico extends Produto{


    public LivroFisico(){
        setComportamentoDesc(new DescontoFisico());
    }   

    @Override
    public void exibir() {
        System.out.println("Livro Físico"); 
    }
    
}
