public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.addition(2,2);
        calc.showResult();

        calc.subtraction(10,2);
        calc.showResult();

        calc.division(15, 5);
        calc.showResult();

        calc.multiplication(5, 5);
        calc.showResult();
    }
}