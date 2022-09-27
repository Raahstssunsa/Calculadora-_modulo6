public class Subtração implements Operação {

    private final double numero1;
    private final double numero2;


    public Subtração(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @Override
    public String toString(){
        return "Subtração de" + numero1 + numero2 + "=" + calcula();
    }


    @Override
    public double calcula() {
        return  numero1 - numero2;
    }
}
