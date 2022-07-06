package Interview;

class Main implements Functions {


    @Override
    public void display(String result) {

    }


    @Override
    public double labelAdding(double firstNumber, double secondNumber) {
        return firstNumber+secondNumber;
    }

    @Override
    public double labelSubtracting(double firstNumber, double secondNumber) {
        return firstNumber-secondNumber;
    }

    @Override
    public double labelMultiply(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }

    @Override
    public double labelDiving(double firstNumber, double secondNumber) {
        return firstNumber/secondNumber;
    }



    public static void main(String[] args) {
        Main m=new Main();
        double firstNumber = 100.00;
        double secondNumber = 20.00;
        System.out.println("Result is :: "+m.labelAdding(firstNumber, secondNumber));
        System.out.println("Result is :: "+m.labelSubtracting(firstNumber, secondNumber));
        System.out.println("Result is :: "+m.labelMultiply(firstNumber, secondNumber));
        System.out.println("Result is :: "+m.labelDiving(firstNumber, secondNumber));



        //System.out.println(m.labelAdding(100.00, 20.00));
        
    }

}
interface  Outputs{
     void display (String result);

}
interface Functions extends Outputs{
    double labelAdding(double firstNumber, double secondNumber);
    double labelSubtracting(double firstNumber, double secondNumber);
    double  labelMultiply(double firstNumber, double secondNumber);
    double labelDiving(double firstNumber, double secondNumber);



}
