package classes;

import interfaces.CompDesc;

public class DescontoFisico implements CompDesc{

    @Override
    public void desconto() {
        System.out.println("Desconto de 30%");
    }
    
}
