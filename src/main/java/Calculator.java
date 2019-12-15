public class Calculator {


    public static int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int difference(int firstNumber, int secondNumber) {
        return (secondNumber - firstNumber ) < 0 ? 0 : (secondNumber - firstNumber);
    }

    public static int multiply (int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber);
    }

    public static int divide (int firstNumber, int secondNumber) {
        return secondNumber == 0 ? -1 : firstNumber/secondNumber ;
    }


    public static void main(String args[]) {
        System.out.print("Hello world");

        int add = sum(1,2);
    }



}
