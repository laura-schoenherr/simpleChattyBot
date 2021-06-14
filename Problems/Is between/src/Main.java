import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean check1 = one <= two && one >= three;
        boolean check2 = one >= two && one <= three;

        if (check1) {
            System.out.println(check1);
        } else {
            System.out.println(check2);
        }
    }
}