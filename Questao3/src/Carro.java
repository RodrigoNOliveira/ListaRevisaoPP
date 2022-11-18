
public class Carro {

    private String modelo;
    private String cor;
    private double preco;

    public Carro() {
    }

    public Carro(String modelo, String cor, double preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }


    public Carro fabricaCarro(String modelo, String cor, double preco){
        Carro c = new Carro(modelo, cor, preco);
        return c;
    }


    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", cor=" + cor + ", preco=" + preco + "]";
    }

    

    

    

}
