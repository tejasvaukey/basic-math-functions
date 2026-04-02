import static java.lang.Math.log10;

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

    static void main(String[] args) {
        printAllDivisor(36);
    }
}