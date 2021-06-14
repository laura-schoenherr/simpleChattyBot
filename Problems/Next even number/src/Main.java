import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int inputNumber = scanner.nextInt();
        int nextEvenNumber;
        //check if number can be divided by two (even number)
        if (inputNumber % 2 == 0) {
            nextEvenNumber = inputNumber + 2;
        } else {
            nextEvenNumber = inputNumber + 1;
        }
        System.out.println(nextEvenNumber);
    }
}