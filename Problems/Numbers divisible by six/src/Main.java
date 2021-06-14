import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long n;
        long endSum = 0;
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long numberElementsInSequence = scanner.nextInt();
        for (long i = 0; i < numberElementsInSequence; i++) {
             n = scanner.nextInt();
             if (n % 6 == 0) {
                endSum += n;
            }
        }
        System.out.println(endSum);
    }
}