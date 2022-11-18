package classes;

public class RevistaDigital extends Produto{

    public RevistaDigital() {
        setComportamentoDesc(new DescontoDigital());
    }

    @Override
    public void exibir() {
        System.out.println("Revista Digital"); 
    }
    
}
