import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean check1 = one > 0 && two <= 0 && three <= 0;
        boolean check2 = one <= 0 && two > 0 && three <= 0;
        boolean check3 = one <= 0 && two <= 0 && three > 0;

        boolean checkAll = check1 || check2 || check3;
        System.out.println(checkAll);
    }
}