package classes;

import interfaces.CompDesc;

public class SemDesconto implements CompDesc{

    @Override
    public void desconto() {
        System.out.println("Sem desconto");
    }
}
