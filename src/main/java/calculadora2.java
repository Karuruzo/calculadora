public class calculadora2 {
    private double ANS;
    public void soma (double A, double B){
        //TODO FUNÇÃO SOMA
        ANS=A+B;
        System.out.println("soma="+(A+B));
    }
    public void subtracao (double A, double B){
        //TODO FUNÇÃO SUBTRAÇÃO
        ANS=A-B;
        System.out.println("subtração="+(A-B));
    }
    public void multiplicacao (double A, double B){
        //TODO FUNÇÃO MULTIPLICAÇÃO
        ANS=A*B;
        System.out.println("multiplicação="+(A*B));
    }
    public void divisao (double A, double B){
        //TODO FUNÇÃO DIVISÃO
        ANS=A/B;
        System.out.println("divisão="+(A/B));
    }
    public void bhaskara (double A, double B, double C){
        //TODO FUNÇÃO BHASKARA
        double delta, x1,x2;
        delta=(Math.pow(B,2))-(4*A*C);
        x1=(-B+(Math.sqrt(delta)))/(2*A);
        x2=(-B-(Math.sqrt(delta)))/(2*A);
        if (delta <=0){
            System.out.println("delta menor que zero");
            System.out.println(delta);
        }
        else{
            System.out.println("x1="+(x1));
            System.out.println("x2="+(x2));
        }
    }
    public void raiz (double radicando, double indice){
        //TODO FUNÇÃO RAIZ
        ANS=Math.pow(radicando,1/indice);
        System.out.println("raiz="+(Math.pow(radicando,1/indice)));
    }
    public void potencia (double base, double expoente){
        //TODO FUNÇÃO POTENCIA
        ANS=Math.pow(base, expoente);
        System.out.println("potencia="+(Math.pow(base, expoente)));
    }
    public double getANS() {
        return ANS;
    }
}
