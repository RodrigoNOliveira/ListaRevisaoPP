package classes;

public class RevistaFisica extends Produto{

    public RevistaFisica() {
        setComportamentoDesc(new DescontoFisico());
    }   

    @Override
    public void exibir() {
        System.out.println("Revista Física"); 
    }
    
    
}
