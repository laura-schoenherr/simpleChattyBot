import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean check1;
        check1 = one != two && two != three && one != three;
        System.out.println(check1);
    }
}