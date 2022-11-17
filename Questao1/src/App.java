import obj_concretos.Aluno;
import obj_concretos.Assinatura;
import obj_concretos.Revista;

public class App {
    public static void main(String[] args) throws Exception {
        Revista rv1 = new Revista(5, "Iftm Eventos", 2022, "https://iftm.edu.br/eventos/");

        Revista rv2 = new Revista(2, "Iftm Cursos", 2022, "https://iftm.edu.br/cursos/");

        Revista rv3 = new Revista(24, "Iftm Noticias", 2022,
                "https://iftm.edu.br/noticias/2022/11/09/abertas-inscricoes-para-cursos-de-idiomas-gratuitos-em-nivel-iniciante-no-iftm/");

        Aluno a1 = new Aluno("Rodrigo");
        Aluno a2 = new Aluno("Pedro");
        Aluno a3 = new Aluno("Maria");

        Assinatura assinatura = new Assinatura();

        assinatura.add(a1);
        assinatura.add(a2);
        assinatura.add(a3);

        assinatura.setRevista(rv1);
        assinatura.ntf();

        System.out.println("\n" + a1);
        System.out.println("\n" + a2);
        System.out.println("\n" + a3);

        assinatura.rmv(a3);

        assinatura.setRevista(rv2);
        assinatura.ntf();

        assinatura.rmv(a2);
        assinatura.setRevista(rv3);
        assinatura.ntf();
        System.out.println();
        System.out.println("\n" + a1);
        System.out.println("\n" + a2);
        System.out.println("\n" + a3);

    }
}
