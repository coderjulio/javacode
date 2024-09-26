package veiculos_6_7;

public abstract class Veiculo {

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    private String marca;
    private String modelo;
    private int ano;

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public int acelerar() {
        return 0;
    }

}
