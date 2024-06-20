package conta;



public class Conta_Bancaria {



    public String nome;
    public long cpf;
    private long conta;



    public long  Saldo(){
       return  this.conta = 0;
    }



    public long getSaldo(){
        return this.conta;
    }


    public void adicionar_dinheiro(long number){
        this.conta = number;
    }

}
