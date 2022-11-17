package obj_concretos;

import interfaces.Observador;
import interfaces.Observavel;

public class Aluno implements Observador {

    private String nome;

    private Revista revista = new Revista();

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public void att(Observavel observavel) {
       Assinatura assinatura = (Assinatura) observavel;
       this.revista = assinatura.getRevista();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + "\n" + revista;
    }

}
