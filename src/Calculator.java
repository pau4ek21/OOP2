public class Calculator {
    private double result;

    public Calculator() {
        result = 0.0;
    }

    public void addition(double a, double b){
        result = a + b;
    }

    public void subtraction(double a, double b){
        result = a - b;
    }

    public void multiplication(double a, double b){
        result = a * b;
    }
    public void division(double a, double b){
        if (a != 0 && b != 0){
            result = a / b;
        }
        else result = 0.0;
    }

    public double getResult(){
        return result;
    }

    void showResult(){
        System.out.println(getResult());
    }


}
