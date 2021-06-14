import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int fourthNumber = scanner.nextInt();
        firstNumber = firstNumber - 1;
        secondNumber = secondNumber - 1;
        thirdNumber = thirdNumber - 1;
        fourthNumber = fourthNumber - 1;
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");
        System.out.print(thirdNumber + " ");
        System.out.print(fourthNumber + " ");
    }
}