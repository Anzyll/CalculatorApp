import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator App");
        new CalculatorApp().run();
    }
    public  int add(int number1,int number2){
        return number1+number2;
    }
    public   int subtract(int number1,int number2){
        return number1-number2;
    }
    public   int multiply(int number1,int number2){
        return number1*number2;
    }
    public  int divide(int number1,int number2){
        try {
            return number1/number2;
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by 0, please try again.");
            return -1;
        }

    }


    public void run(){
        while(true) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("select an operation : \n 1 : Add \n 2 : subtract \n 3 : multiply \n 4 : divide\n 5 : factorial \n  6 : exit");
           int operation = scanner.nextInt();
           if(operation==6){
               break;
           }
            System.out.println("enter first number");
            int firstNumber = scanner.nextInt();
            System.out.println("enter second number");
            int secondNumber = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println(add(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println(subtract(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println(multiply(firstNumber, secondNumber));
                    break;
                case 4:
                    System.out.println(divide(firstNumber, secondNumber));
                    break;

                default:
                    System.out.println("invalid operation");
                    continue;
            }

        }
    }

}