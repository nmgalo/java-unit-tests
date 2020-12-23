package ge.edu.btu;

import ge.edu.btu.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorServiceImpl();
        int x = calculator.divide(12, 2);
        System.out.println(x);
    }
}
