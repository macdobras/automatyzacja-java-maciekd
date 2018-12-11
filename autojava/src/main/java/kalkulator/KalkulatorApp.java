package kalkulator;

public class KalkulatorApp {

    public int add(int a, int b){
        return a + b;
    }

    // przeciążenie metody add() --> te same nazwy, ale inne parametry przez co kompilator potrafi rozróżnić
    public double add(double x, double y){
        return x + y;
    }

    public double divide (double a, double b){
        return a / b;
    }
}
