package calculadora_1_2;

public class Calculadora {


    public void Somar(double ...n){
        double soma = 0;
        for(int i = 0; i < n.length; i++){
            soma += n[i];
        }
        System.out.println(soma);
    }

    public void Subtrair(double ...n){
        double sub = n[0];
        for(int i = 1; i < n.length; i++){
            sub -= n[i];
        }
        System.out.println(sub);
    }

    public void Mult(double ...n){
        double mult = n[0];
        for(int i = 1; i < n.length; i++){
            mult *= n[i];
        }
        System.out.println(mult);
    }

    public void Div(double ...n){
        double div = n[0];
        for(int i = 1; i < n.length; i++){
            div /= n[i];
        }
        System.out.println(div);
    }


}
