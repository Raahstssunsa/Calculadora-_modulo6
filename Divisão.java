public class Divisão implements Operação{

    private double numero1;
    private double numero2;


    public Divisão(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }


    @Override
    public double calcula() {
        double resultadoDivisão = numero1 / numero2;
        return  resultadoDivisão;
    }
    @Override
    public String toString(){
        return "Soma de" + numero1 + numero2 + "=" + calcula();
    }
}