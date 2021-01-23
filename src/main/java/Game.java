import java.util.Random;
import java.util.Scanner;

//this is the code to run the game
public class Game {
    int counter = 0;
    int computerCount = 0;
    int exit;
    int rock = 1;
    int paper = 2;
    int scissors = 3;
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    public void intro() {
        System.out.println("Hello, welcome to this game of Roshambo or ROCK PAPER SCISSORS, what is your name");
        String name = scanner.next();
        System.out.println(name + ", I hope you are ready to take on the challenge of the mighty ROSHAMBOOOO");
    }

    private void restart() {
        counter = 0;
        computerCount = 0;
    }

    public void play() {
        System.out.println("Press 1 to select the Mighty Rock, 2 for Perfect Paper or 3 for the Superior Scissors");
        int selection = scanner.nextInt();

        if (selection == 1) {
            System.out.println("You have selected ROCK!");
            int computerRand = rand.nextInt(3);
            if (rock > computerRand) {
                System.out.println("You win!!");
                counter++;
                System.out.println("You have won "+counter+" round(s)");
                if (counter == 3) {
                    System.out.println("\nYou win, you are the champion, restart?\nPress y for yes or n for no");
                    String response = scanner.next().toUpperCase();
                    if (response.equals("Y")) {
                        restart();
                        play();
                    } else if (response.equals("N")) {
                        exit++;
                    }
                }
            } else if (rock < computerRand) {
                System.out.println("you lose!!");
                computerCount++;
                if (computerCount == 3) {
                    System.out.println("\nYou lost, game over, restart?\nPress y for yes or n for no");
                    String response = scanner.next().toUpperCase();
                    if (response.equals("Y")) {
                        restart();
                        play();
                    } else if (response.equals("N")) {
                        exit++;
                    }
                }
            } else {
                System.out.println("You have drew");
            }
        }
        if (selection == 2) {
            System.out.println("you have selected PAPER!");
            int computerRand = rand.nextInt(3) + 1;
            if (paper > computerRand) {
                System.out.println("You win!!");
                counter++;
                System.out.println("You have won "+counter+" round(s)");
                if (counter == 3) {
                    System.out.println("\nYou win, you are the champion, restart?\nPress y for yes or n for no");
                    String response = scanner.next().toUpperCase();
                    if (response.equals("Y")) {
                        restart();
                        play();
                    } else if (response.equals("N")) {
                        exit++;
                    }
                }
            } else if (paper < computerRand) {
                System.out.println("You lose!!");
                computerCount++;
                if (computerCount == 3) {
                    System.out.println("\nYou lost, game over, restart?\nPress y for yes or n for no");
                    String response = scanner.next().toUpperCase();
                    if (response.equals("Y")) {
                        restart();
                        play();
                    } else if (response.equals("N")) {
                        exit++;
                    }
                }
            } else {
                System.out.println("You have drew");
            }
        }
        if (selection == 3) {
            System.out.println("you have selected Scissors!");
            int computerRand = rand.nextInt(3) + 1;
            if (scissors > computerRand) {
                System.out.println("You win!!");
                counter++;
                System.out.println("You have won "+counter+" round(s)");
                if (counter == 3) {
                    System.out.println("\nYou win, you are the champion, restart?\nPress y for yes or n for no");
                    String response = scanner.next().toUpperCase();
                    if (response.equals("Y")) {
                        restart();
                        play();
                    } else if (response.equals("N")) {
                        exit++;
                    }
                }
            } else if (scissors < computerRand) {
                System.out.println("You lose!!");
                computerCount++;
                if (computerCount == 3) {
                    System.out.println("\nYou lost, game over, restart?\nPress y for yes or n for no");
                    String response = scanner.next().toUpperCase();
                    if (response.equals("Y")) {
                        restart();
                        play();
                    } else if (response.equals("N")) {
                        exit++;
                    }
                }
            } else {
                System.out.println("You have drew");
            }
        }

    }
}
