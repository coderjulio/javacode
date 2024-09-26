package veiculos_6_7;

public class Test {
    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", "Corolla", 2024);
        Moto m1 = new Moto("Honda", "CBR", 2020);

        System.out.println(c1.getMarca() + " " + c1.getModelo() + " " + c1.getAno());
        System.out.println("Acelerando... " + c1.acelerar() + "km/h");
        System.out.println("Acelerando... " + c1.acelerar() + "km/h");
        System.out.println("Acelerando... " + c1.acelerar() + "km/h");
        System.out.println("Acelerando... " + c1.acelerar() + "km/h");
        System.out.println("-------------------------------");
        System.out.println(m1.getMarca() + " " + m1.getModelo() + " " + m1.getAno());
        System.out.println("Acelerando... " + m1.acelerar() + "km/h");
        System.out.println("Acelerando... " + m1.acelerar() + "km/h");
        System.out.println("Acelerando... " + m1.acelerar() + "km/h");
        System.out.println("Acelerando... " + m1.acelerar() + "km/h");
    }
}
