import coqueteis.Caipirinha;
import coqueteis.CaipirinhaIogurte;
import coqueteis.CaipirinhaLeiteCondensado;
import coqueteis.CaipirinhaMaisAcucar;

public class App {
    public static void main(String[] args) throws Exception {
        Caipirinha caipirinha = new Caipirinha();
        CaipirinhaLeiteCondensado caipirinhaLeiteCondensado = new CaipirinhaLeiteCondensado(caipirinha);
        CaipirinhaIogurte caipirinhaIogurte = new CaipirinhaIogurte(caipirinha);
        CaipirinhaMaisAcucar caipirinhaMaisAcucar = new CaipirinhaMaisAcucar(caipirinha);

        System.out.println(caipirinha.retornaNome());
        System.out.println(caipirinha.retornaPreco());


        System.out.println(caipirinhaIogurte.retornaNome());
        System.out.println(caipirinhaIogurte.retornaPreco());

        System.out.println(caipirinhaLeiteCondensado.retornaNome());
        System.out.println(caipirinhaLeiteCondensado.retornaPreco());

        System.out.println(caipirinhaMaisAcucar.retornaNome());
        System.out.println(caipirinhaMaisAcucar.retornaPreco());
    }
}
