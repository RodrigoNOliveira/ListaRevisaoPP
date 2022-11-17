package interfaces;

public interface Observavel {
    
    public void add(Observador observador);

    public void rmv(Observador obs);

    public void ntf();



}
