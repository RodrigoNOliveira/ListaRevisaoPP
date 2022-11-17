package obj_concretos;

public class Revista {

    private int edicao;
    private String titulo;
    private int anoPublicacao;
    private String link;

    public Revista() {
    }

    public Revista(int edicao, String titulo, int anoPublicacao, String link) {
        this.edicao = edicao;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.link = link;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Revista [edicao= " + edicao + ", titulo= " + titulo + ", anoPublicacao= " + anoPublicacao + ", link= "
                + link + "]";
    }

    

}
