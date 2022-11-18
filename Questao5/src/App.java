import classes.JogoTabuleiro;
import classes.JogoVideoGame;
import classes.LivroDigital;
import classes.LivroFisico;
import classes.RevistaDigital;
import classes.RevistaFisica;

public class App {
    public static void main(String[] args) throws Exception {
        LivroDigital livroDigital = new LivroDigital();
        LivroFisico livroFisico = new LivroFisico();
        JogoTabuleiro jogoTabuleiro = new JogoTabuleiro();
        JogoVideoGame jogoVideoGame = new JogoVideoGame();
        RevistaDigital revistaDigital = new RevistaDigital();
        RevistaFisica revistaFisica = new RevistaFisica();




        livroDigital.exibir();
        livroDigital.resultadoDesc();
        System.out.println();
        livroFisico.exibir();
        livroFisico.resultadoDesc();
        System.out.println();
        jogoTabuleiro.exibir();
        jogoTabuleiro.resultadoDesc();
        System.out.println();
        jogoVideoGame.exibir();
        jogoVideoGame.resultadoDesc();
        System.out.println();
        revistaDigital.exibir();
        revistaDigital.resultadoDesc();
        System.out.println();
        revistaFisica.exibir();
        revistaFisica.resultadoDesc();
    }
}
