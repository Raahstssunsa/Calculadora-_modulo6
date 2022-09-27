import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

@Test
    public static void main(String[] args) {
        Scanner operação = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int operador;
        double numero1;
        double numero2;

        Adição adição = new Adição(20,40);
        System.out.println("Resultado do teste de soma é :" + calculadora.executa(adição));
        Subtração subtração = new Subtração(10,5);
        System.out.println("Resultado do teste da subtrair é :" + calculadora.executa(subtração));
        Multiplicação mutiplicação = new Multiplicação(20,2);
        System.out.println("Resultado do teste da Multiplicação é :" + calculadora.executa(mutiplicação));
        Divisão divisão = new Divisão(100,2);
        System.out.println("Resultado do teste da divisão é :" + calculadora.executa(divisão));

    }
}

