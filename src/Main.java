import java.util.ArrayList;

import static java.lang.Math.*;

class Main{

    public static int countDigits(int num){
        int digits = 0;
//        int t; // last digit
        while(num > 0){
//            t = num%10;  // for extraction of digits
            digits++;
//            System.out.print(t);
            num = num/10; // for counting only
        }
        return digits;
    }

    public static int countDigits2(int num){
        int count = (int)(log10(num) + 1);
        return count;
    }

    public static int reverseNumber(int n){
        int reverse = 0;
        int lastDigit;
        while(n > 0){
            lastDigit = n % 10;
            n = n/10;
            reverse = (reverse * 10) + lastDigit;
        }
        return reverse;
    }

    public static void checkPalindrome(int n){
        int reverse = reverseNumber(n);
        if ((reverse == n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void isArmstrongNumber(int n){
        // if sum of square of individual digit of a number is equal to the number
        int dup = n;
        int sumOfCubes = 0;
        int lastDigit;
        while(n > 0){
            lastDigit = n % 10;
            sumOfCubes = sumOfCubes + (lastDigit*lastDigit*lastDigit);
            n = n/10;
        }
        if(sumOfCubes == dup) System.out.println("Yes!!");
        else System.out.println("No");

    }

    public static void printAllDivisor(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) System.out.print(i+", ");
        }
    }

    // ARRAY LIST IMPLEMENTATION
//    public static void printAllDivisor2(int n){
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= sqrt(n); i++) {
//            if(n%i == 0) {
//                System.out.print(i+", ");
//
//            }
//        }
//    }

    public static void isPrime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) count++;
        }
        if(count == 2) System.out.print("Yes!!");
        else System.out.println("No");
    }

    public static void printGCD(int n1, int n2){
        int mini = min(n1,n2);
        for (int i = mini; i >= 1; i--) {
            if(n1 % i == 0 && n2 % i == 0){
                System.out.println(i);
                break;
            }
        }

    }

    public static void printGCD2(int a, int b){
        // EUCLIDEAN ALGORITHM
        while(a>0 && b>0){
            if(a > b) a = a%b;
            else b = b%a;
        }
        if(a==0) System.out.println(b);
        else System.out.println(a);

    }

    static void main(String[] args) {
        printGCD(36, 24);
    }
}