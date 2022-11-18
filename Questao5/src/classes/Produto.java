package classes;


import interfaces.CompDesc;

public abstract class Produto {
    CompDesc comportamentoDesc;

    public Produto(){
    }


    public void setComportamentoDesc(CompDesc compDesconto){
        this.comportamentoDesc = compDesconto;
    }

  

    public void resultadoDesc(){
        this.comportamentoDesc.desconto();
    }
   
    public abstract void exibir();






}
