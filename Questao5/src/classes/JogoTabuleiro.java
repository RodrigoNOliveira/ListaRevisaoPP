package classes;

public class JogoTabuleiro extends Produto{

    public JogoTabuleiro() {
        setComportamentoDesc(new DescontoFisico());
    }   

    @Override
    public void exibir() {
        System.out.println("Jogo de Tabuleiro"); 
    }
    
}
