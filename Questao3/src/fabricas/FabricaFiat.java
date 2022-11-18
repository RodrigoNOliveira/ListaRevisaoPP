package fabricas;

import veiculos.Palio;
import veiculos.Veiculos;

public class FabricaFiat extends FabricaVeiculo{
    @Override
    public Veiculos pegaVeiculos(String nomeVeiculo) {
        return new Palio(nomeVeiculo);
    }
}
