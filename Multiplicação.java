public class Multiplicação implements Operação{

    private double numero1;
    private double numero2;


    public Multiplicação(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Multiplicação() {

    }

    @Override
    public double calcula() {
        double resultadoMultiplicalção = numero1 * numero2;
        return  resultadoMultiplicalção;
    }
    @Override
    public String toString(){
        return "Soma de" + numero1 + numero2 + "=" + calcula();
    }
}

