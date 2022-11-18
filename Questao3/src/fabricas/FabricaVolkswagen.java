package fabricas;

import veiculos.Gol;
import veiculos.Veiculos;

public class FabricaVolkswagen extends FabricaVeiculo{
    @Override
    public Veiculos pegaVeiculos(String nomeVeiculo) {
        return new Gol(nomeVeiculo);
    }
}
