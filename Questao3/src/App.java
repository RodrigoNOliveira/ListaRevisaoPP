import java.util.Random;

import fabricas.FabricaChevrolet;
import fabricas.FabricaFiat;
import fabricas.FabricaFord;
import fabricas.FabricaVolkswagen;
import veiculos.Celta;
import veiculos.Fiesta;
import veiculos.Gol;
import veiculos.Palio;
import veiculos.Veiculos;

public class App {
    public static void main(String[] args) throws Exception {

        String[] vetorCliente= {"Ana", "Maria", "Pedro", "Joao"};
    

    for (int i = 0; i < 10; i++) {
        Veiculos v = algoritmoVeiculoAleatorio();
        String nomeCliente = vetorCliente[geraNumeroAleatorio(4)];
        v.abastecerCarro(nomeCliente);
        v.parada();
        System.out.println();
    }       
    }
    public  static Veiculos algoritmoVeiculoAleatorio(){

        FabricaChevrolet fc = new FabricaChevrolet();
        FabricaFiat ff = new FabricaFiat();
        FabricaFord fFord = new FabricaFord();
        FabricaVolkswagen fg = new FabricaVolkswagen();

        Celta v1 = (Celta) fc.pegaVeiculos("Celta");
        Palio v2 = (Palio) ff.pegaVeiculos("Palio");
        Fiesta v3 = (Fiesta) fFord.pegaVeiculos("Fiesta");
        Gol v4 = (Gol) fg.pegaVeiculos("Gol");

        Veiculos[] vetor = {v1, v2, v3, v4};

        int indiceVetor = geraNumeroAleatorio(3);
        return vetor[indiceVetor];
    }

    public static int geraNumeroAleatorio(int limite){
        Random rand = new Random();
        return rand.nextInt(limite);
    }



}
