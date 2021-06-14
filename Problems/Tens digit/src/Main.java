import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int newNumber = scanner.nextInt();
        //ten digit
        int tenDigit = newNumber % 100;
        tenDigit = tenDigit / 10;
        System.out.println(tenDigit);



    }
}