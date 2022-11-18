package classes;

public class JogoVideoGame extends Produto{

    public JogoVideoGame() {
        setComportamentoDesc(new SemDesconto());
    }   

    @Override
    public void exibir() {
        System.out.println("Jogo de Video Game"); 
    }
}
