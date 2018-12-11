package calculator;

//import static org.junit.jupiter.api.Assertions.*; - załadwoanie wszytkich metod Assertion
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Kocurek") //trzeba prawidłowo opisywać testy - co one zawierają (tutaj w nazwa taka w celach szkoleniowych)
class CalculatorAppTest {

    // nazywać klasy tak, żeby wiedzieć co jest sprawdzane (jest to istotne --> pytanie: co działa?)

    @Test
    public void addTwoPositiveIntegers() {
        //arrange
        CalculatorApp calc = new CalculatorApp();

        //act
        int suma = calc.add(1, 2);

        //assert
        Assertions.assertEquals(3, suma, "sprawdź, że dodawanie liczb całkowitych działa");
    }

    @Test
    public void addTwoPositiveDoubles() {
        //arange
        CalculatorApp calc = new CalculatorApp();

        //act
        double suma = calc.add(1.6,2.5);

        // assert
        Assertions.assertEquals(4.1, suma, 0.000000001, "sprawdź, że dodawanie liczb zmiennoprzecinkowe działa");
        // dodawajmy deltę przy działaniach na liczbach zmiennoprzecinkowych! mog się pojawić różnice
        // w liczeniach - zależy to od architekrutu procesora
    }

    @Test
    public void divideTwoIntegers(){
        CalculatorApp calc = new CalculatorApp();
        double division = calc.divide(8,3);
        Assertions.assertEquals(2.6666, division, 0.0001, "sprawdź, że dzielenie liczb całkowitych działa");
    }

    @Test
    public void divideTwoDoubles(){
        CalculatorApp calc = new CalculatorApp();
        double division = calc.divide(10.5,2.5);
        Assertions.assertEquals(4.2, division, 0.000000001, "sprawdź, że dzielenie liczb zmiennoprzecinkowych działa");
    }
}