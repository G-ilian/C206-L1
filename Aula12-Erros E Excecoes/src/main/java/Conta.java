public class Conta {
    // Atributo
    private double saldo;

    public Conta(double valor){
        this.saldo=valor;
    }

    // Métodos da conta

    public void sacar(double valorSaque){

        // Try catch para realizar o saque
        try{
            if(valorSaque>saldo){
                throw new SemSaldoException(valorSaque,this.saldo);
            }else{
                this.saldo=this.saldo-valorSaque;
            }

        }catch(SemSaldoException semSaldo){
            //System.out.println(semSaldo);
        }

    }

    /*
        public void sacar(double valorSaque) throws SemSaldoException{

        // Try catch para realizar o saque
        try{
            if(valorSaque>saldo){
                throw new SemSaldoException();
            }else{
                this.saldo=this.saldo-valorSaque;
            }

        }catch(SemSaldoException semSaldo){
            System.out.println(semSaldo);
        }

    }
     */

}
