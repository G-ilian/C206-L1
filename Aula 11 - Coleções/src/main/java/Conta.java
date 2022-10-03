public class Conta implements Comparable<Conta>{

    private String dono;
    private float saldo;

    // Construtor na conta
    public Conta(String dono, float saldo){
        this.dono=dono;
        this.saldo=saldo;
    }

    // Getters da conta

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    // Reescrevendo método de comparação
    @Override
    public int compareTo(Conta c) {
        return Float.compare(this.saldo,c.saldo);
    }


}
