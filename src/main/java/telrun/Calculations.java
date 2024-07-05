package telrun;

public class Calculations {
    public static int sum(int op1, int op2) {
        int res = op1 + op2;
        return res;
    }

    public static int multiply(int op1, int op2) {
        int res = op1 * op2;
        return res;
    }

    public static int divide(int op1, int op2) {
        if (op2 == 0) {
            System.out.println("Wrong data");
            return 0;
        }
        int res = op1 / op2;
        return res;
    }

    public static int subtract(int op1, int op2){
        int res = op1 - op2;
        return res;
    }

    public static int sumOfDigits(int number){
        int sumofDig = 0;//789
        int subNumber;
        while (number > 0) {
            subNumber = number % 10; //78
            sumofDig = sumofDig + subNumber;
            number = number / 10;
        }
        return sumofDig;
    }

    public static int maxDigit(int number) {
       int maxNumber = 0;
       int subNumber;
       while (number > 0) {
            subNumber = number % 10;
            if (subNumber > maxNumber) {
                maxNumber = subNumber;            
           }
           number = number / 10;
       }
        return maxNumber;
    }

    public static boolean isDivided(int number, int divider) {
        if (divider == 0) {
            System.out.println("Wrong data");
            return false;
        }
        if (number % divider == 0) {
            return true;
        } else {
            return false;
        } 
    }
}
