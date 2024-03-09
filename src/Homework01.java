public class Homework01
{
    // Data type used here is integer (int)
    static int a = 100; //declaration and initialisation
    static int b = 20;
    static int ans = a * b;
    static void multiply() //no return no parameter
    {ans = a * b;
        System.out.println("multiplication of " + a + " * " + b + " = " + ans);}
    static void divide()//no return no parameter
    {ans = a / b;
        System.out.println("division of " + a + " / " + b + " = " + ans);}
    static void addition(int c, int d)//no return with parameter
    {ans = c + d;
        System.out.println("addition of " + c + " + " + d + " = " + ans);}
    static void subtract(int e, int f) //no return with parameter
    {ans = e - f;
        System.out.println("subtraction of " + e + " - " + f + " = " + ans);}
    public static void main(String[] args) {
        System.out.println();
        multiply();
        divide();
        addition(50, 50);
        subtract(60, 30);


    }

}
