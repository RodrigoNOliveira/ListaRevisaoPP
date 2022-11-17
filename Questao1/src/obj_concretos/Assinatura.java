package obj_concretos;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observador;
import interfaces.Observavel;

public class Assinatura implements Observavel{


    private List<Observador> lista = new ArrayList<>();
    private Revista revista = new Revista();


    @Override
    public void add(Observador observador) {
        if(!lista.contains(observador)){
            this.lista.add(observador);
        }
        
    }

    @Override
    public void rmv(Observador obs) {
        if(lista.contains(obs)){
            lista.remove(obs);
        }
        
    }

    @Override
    public void ntf() {
        for (Observador o : lista) {
            o.att(this);
        }
        
    }


    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }
    
}
