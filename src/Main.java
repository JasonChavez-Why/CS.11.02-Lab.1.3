/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Jason Chan
*****************************************************************************************************
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String e = scanner.nextLine();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int z = scanner.nextInt();
        //Scanner f2 = new Scanner(System.in);
        System.out.println(add(x, y, z, w));
        System.out.println(morningGreeting(e));
    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    
    // 2. add       add(3,8,4,9) → 24
    public static int add(int a, int b, int c, int d){
        int e = add(a, b);
        int f = add(c, d);
        return add(e, f);
    }

    // 3. morningGreeting       morningGreeting(“Toby Fox”) → 早上好, Toby Fox!
    public static String morningGreeting(String a){
        return "早上好, " + a + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String a){
        return "下午好, " + a + "!";
    }
    // 5. triple
    public static String triple(String a){
        return a + a + a;
    }
    // 6. half
    public static double half(int a){
        return (double) a/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) (a + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double b){
        return (int) -roundPositiveValueToNearestInteger(-b);
    }
}
