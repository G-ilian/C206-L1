public class SemSaldoException extends Exception{

        public SemSaldoException(double valorSaque,double saldo){
            System.out.println("Não foi possível fazer o saque !!!");
            System.out.println("Valor de Saque: "+valorSaque+" R$");
            System.out.println("Saldo: "+saldo+" R$");
        }
}
