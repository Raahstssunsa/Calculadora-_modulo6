import java.util.ArrayList;
import java.util.List;

public class Calculadora {


    private List<Operação> operações = new ArrayList<>();

    public List<Operação> getOperações() {
        return operações;
    }


    public double executa(Operação operação) {
        operações.add(operação);
        return operação.calcula();
    }
    void lista(List<Operação>operações){
        System.out.println(operações);
    }



}
