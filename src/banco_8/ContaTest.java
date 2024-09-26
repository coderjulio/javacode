package banco_8;

public class ContaTest {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(1200);
        conta.sacar(1300);
        conta.sacar(300);
        conta.consultarSaldo();
    }
}
