public class palindromNumber {
    static boolean isPalindrom(int n) {
        int number=n, reverseNumber=0, lastNumber;
        while (number!=0){
            lastNumber = number%10;
            reverseNumber = (reverseNumber *10) + lastNumber;
            number /= 10;

        }
        if (n == reverseNumber)
            return true;
        else
            return    false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(99));
    }
}
