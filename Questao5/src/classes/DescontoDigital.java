package classes;

import interfaces.CompDesc;


public class DescontoDigital implements CompDesc{

    @Override
    public void desconto() {
       System.out.println("Desconto de 15%");
    }

    
}
