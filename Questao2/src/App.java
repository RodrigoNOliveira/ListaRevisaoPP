import coqueteis.adicionais.Acucar;
import coqueteis.adicionais.Energetico;
import coqueteis.adicionais.Gelo;
import coqueteis.adicionais.Iogurte;
import coqueteis.adicionais.LeiteCondensado;
import coqueteis.adicionais.Limao;
import coqueteis.adicionais.RefrigeranteDeCola;
import coqueteis.adicionais.SucoDeLaranja;
import coqueteis.principais.Caipirinha;
import coqueteis.principais.Rum;
import coqueteis.principais.Tequila;
import coqueteis.principais.Vodka;
import coqueteis.principais.Whisky;

public class App {
    public static void main(String[] args) throws Exception {



        // CAIPIRINHAS
 
        Caipirinha caipirinha = new Caipirinha();
        LeiteCondensado caipirinhaLeiteCondensado = new LeiteCondensado(caipirinha);
        Iogurte caipirinhaIogurte = new Iogurte(caipirinha);
        Acucar caipirinhaMaisAcucar = new Acucar(caipirinha);
        System.out.println("\nCAIPIRINHAS\n");
        System.out.println(caipirinha.retornaNome());
        System.out.println(caipirinha.retornaPreco());
        System.out.println(caipirinhaIogurte.retornaNome());
        System.out.println(caipirinhaIogurte.retornaPreco());
        System.out.println(caipirinhaLeiteCondensado.retornaNome());
        System.out.println(caipirinhaLeiteCondensado.retornaPreco());
        System.out.println(caipirinhaMaisAcucar.retornaNome());
        System.out.println(caipirinhaMaisAcucar.retornaPreco());



        //HIFI E ICE_VODKA_LIMAO
 
        Vodka vodka = new Vodka();
        SucoDeLaranja sucoLaranja = new SucoDeLaranja(vodka);
        Gelo gelo = new Gelo(sucoLaranja);
        System.out.println();
        System.out.println("\nHIFI\n");
        System.out.println(vodka.retornaNome());
        System.out.println(vodka.retornaPreco());
        System.out.println(sucoLaranja.retornaNome());
        System.out.println(sucoLaranja.retornaPreco());
        System.out.println(gelo.retornaNome());
        System.out.println(gelo.retornaPreco());
        System.out.println();


        Limao limao = new Limao(vodka);
        gelo = new Gelo(limao);
        System.out.println("\nICE_VODKA_LIMAO\n");
        System.out.println(vodka.retornaNome());
        System.out.println(vodka.retornaPreco());
        System.out.println(limao.retornaNome());
        System.out.println(limao.retornaPreco());
        System.out.println(gelo.retornaNome());
        System.out.println(gelo.retornaPreco());
        System.out.println();


     //TEQUILA
        System.out.println("\nTEQUILA\n");
        Tequila tequila = new Tequila();
        System.out.println(tequila.retornaNome());
        System.out.println(tequila.retornaPreco());
        System.out.println();



        //RUM E CUBA LIBRE 

        Rum rum = new Rum();
        RefrigeranteDeCola cola = new RefrigeranteDeCola(rum);
        gelo = new Gelo(cola);
        System.out.println("\nRUM\n");
        System.out.println(rum.retornaNome());
        System.out.println(rum.retornaPreco());
        System.out.println("\n\nCUBA LIVRE\n");
        System.out.println(cola.retornaNome());
        System.out.println(cola.retornaPreco());
        System.out.println(gelo.retornaNome());
        System.out.println(gelo.retornaPreco());
        System.out.println();


        //WHISKY'S

        Whisky whisky = new Whisky();
        Energetico energetico = new Energetico(whisky);
        System.out.println("\nWHISKY\n");
        System.out.println(whisky.retornaNome());
        System.out.println(whisky.retornaPreco());
        System.out.println("\n\nWHISKY COM ENERGETICO\n");
        System.out.println(energetico.retornaNome());
        System.out.println(energetico.retornaPreco());
        System.out.println();



    }
}
