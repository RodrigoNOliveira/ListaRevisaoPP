package veiculos;

public class Gol implements Veiculos{
    private String nome;

    


    public Gol(String nomeCarro) {
        this.nome = nomeCarro;
    }


    @Override
    public void abastecerCarro(String nomeCliente) {
        System.out.println("O carro de " + nomeCliente + " está sendo abatecido.");
        
    }

    @Override
    public void parada() {
        System.out.println("O " + this.nome + " está freando");
        
    }

    @Override
    public void abrirPortaMalas() {
        System.out.println("O " + this.nome + " abriu o porta-mala");
        
    }

    @Override
    public void abrirJanelas() {
        System.out.println("O " + this.nome + " abriu as janelas");
    }


    @Override
    public String toString() {
        return "Gol [nome=" + nome + "]";
    }


    


    
}
