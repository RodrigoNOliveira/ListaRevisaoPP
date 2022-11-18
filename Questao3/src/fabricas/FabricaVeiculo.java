package fabricas;

import veiculos.Veiculos;

public abstract class FabricaVeiculo {
   
    public abstract Veiculos pegaVeiculos(String nomeVeiculo);

    public Veiculos abastecerCarro(String nomeVeiculo){
        Veiculos carro = this.pegaVeiculos(nomeVeiculo);
        carro.abastecerCarro(nomeVeiculo);
        return carro;
    }
}
