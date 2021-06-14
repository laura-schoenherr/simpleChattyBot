import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int army = scanner.nextInt();
        if (army < 1) {
            System.out.println("no army");
        } else if (army <= 19 && army >= 1) {
            System.out.println("pack");
        } else if (army <= 249 && army >= 20) {
            System.out.println("throng");
        } else if (army <= 999 && army >= 250) {
            System.out.println("zounds");
        } else if (army >= 1000) {
            System.out.println("legion");
        }
    }
}
