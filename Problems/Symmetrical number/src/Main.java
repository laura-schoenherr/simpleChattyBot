import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        char digit1 = number.charAt(0);
        char digit2 = number.charAt(1);
        char digit3 = number.charAt(2);
        char digit4 = number.charAt(3);


        if (digit1 == digit4 && digit2 == digit3) {
            System.out.println("1");
        } else {
            System.out.println("37");
        }


    }
}