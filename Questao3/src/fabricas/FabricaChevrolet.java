package fabricas;

import veiculos.Celta;
import veiculos.Veiculos;

public class FabricaChevrolet extends FabricaVeiculo{

    @Override
    public Veiculos pegaVeiculos(String nomeVeiculo) {
        return new Celta(nomeVeiculo);
    }
    
}
