package veiculos_6_7;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    int acelerar;
    @Override
    public int acelerar() {
        return acelerar += 20;
    }

}
