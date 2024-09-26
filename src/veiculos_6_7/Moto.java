package veiculos_6_7;

public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    int acelerar;
    @Override
    public int acelerar() {
        return this.acelerar += 30;
    }


}
