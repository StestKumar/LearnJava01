public class Calculator {
    static int a = 50;
    static int b = 30;
    static Calculator calculator = new Calculator();
    static int ans;


    static void addition() {
        ans = a + b;
        System.out.println("addition of " + a + " +  " + b + " = " + ans);
    }static void substraction() {

        ans = a - b;
        System.out.println("subtraction of " + a + " - " + b + " =  " + ans);
    }

    static void multiplication(int a, int b) {
        ans = a * b;
        System.out.println("multiplication of " + a + " * " + b + " = " + ans);

    }
    static void division(int n, int p) {
        ans = n / p;
        System.out.println("division of " + n + "/" + p + " = " + ans);
    }

    public static void main(String[] args) {

        System.out.println();
        addition();
        substraction();
        multiplication(6, 10);
        multiplication(10, 5);
        calculator.division(300, 50);


    }


}





