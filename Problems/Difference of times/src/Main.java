import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstHourFirstMoment = scanner.nextInt();
        int firstMinuteFirstMoment = scanner.nextInt();
        int firstSecondsFirstMoment = scanner.nextInt();
        int secondHourFirstMoment = scanner.nextInt();
        int secondMinuteFirstMoment = scanner.nextInt();
        int secondSecondsFirstMoment = scanner.nextInt();

        //seconds of the first time from the first moment
        //hour in minutes
        int firstMomentMinutes = firstHourFirstMoment * 60;
        //all the minutes
        firstMomentMinutes = firstMomentMinutes + firstMinuteFirstMoment;
        //minutes in seconds
        int firstSeconds = firstMomentMinutes * 60;
        //all the seconds
        firstSeconds = firstSeconds + firstSecondsFirstMoment;

        //seconds of the second time from the first moment
        //hour in minutes
        int secondMomentMinutes = secondHourFirstMoment * 60;
        //all the minutes
        secondMomentMinutes = secondMomentMinutes + secondMinuteFirstMoment;
        //minutes in seconds
        int secondSeconds = secondMomentMinutes * 60;
        //all the seconds
        secondSeconds = secondSeconds + secondSecondsFirstMoment;

        //sum of seconds first moment
        int sumOfSeconds = secondSeconds - firstSeconds;
        System.out.println(sumOfSeconds);










    }
}