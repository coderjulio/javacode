package banco_8;

public class Conta implements OperacoesBanco {

    int total = 0;

    @Override
    public void depositar(double saldo) {
        System.out.println("Vc depositou: $" + saldo);
        total += saldo;
    }

    @Override
    public void sacar(double saque) {
        if(saque > total){
            System.out.println("Vc n pode sacar este valor");
        } else {
            System.out.println("Vc sacou: $" + saque);
            total -= saque;
        }

    }

    @Override
    public void consultarSaldo() {
        System.out.println("Vc tem de saldo: $" + total);
    }
}
