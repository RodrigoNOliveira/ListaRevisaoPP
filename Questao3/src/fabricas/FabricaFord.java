package fabricas;

import veiculos.Fiesta;
import veiculos.Veiculos;

public class FabricaFord extends FabricaVeiculo{

    @Override
    public Veiculos pegaVeiculos(String nomeVeiculo) {
        return new Fiesta(nomeVeiculo);
    }
    
}
