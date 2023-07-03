import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        String playerMove = "";
        String playerOne = "";
        String playerTwo = "";
        boolean valid = false;
        Boolean playAgain = false;
        String play = "";
        boolean playAgainValid = false;
        do {
            do {
                System.out.println("Player One what is your move (R,P,S): ");
                playerMove = in.nextLine();
                in.nextLine();
                if (playerMove.equalsIgnoreCase("R") || playerMove.equalsIgnoreCase("S") || playerMove.equalsIgnoreCase("P")) {
                    playerOne = playerMove;
                    valid = true;
                } else {
                    System.out.println("You did not pick a valid move, try again ");
                }
            }
            while (!valid);
            do {
                System.out.println("Player Two what is your move (R,P,S): ");
                playerMove = in.nextLine();
                in.nextLine();
                if (playerMove.equalsIgnoreCase("R") || playerMove.equalsIgnoreCase("S") || playerMove.equalsIgnoreCase("P")) {
                    playerTwo = playerMove;
                    valid = true;
                } else {
                    System.out.println("You did not pick a valid move, try again ");
                    valid = false;
                }
            }
            while (!valid);


            if (playerOne.equalsIgnoreCase("R")) {
                if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("Its a tie Rock VS ROCK");
                } else if (playerTwo.equalsIgnoreCase("P")) {
                    System.out.println("Paper Beats Rock Player Two wins");
                } else {
                    System.out.println("Rock Beats Scissors Player One wins");
                }
            } else if (playerOne.equalsIgnoreCase("P")) {
                if (playerTwo.equalsIgnoreCase("P")) {
                    System.out.println("Its a tie Paper VS Paper");
                } else if (playerTwo.equalsIgnoreCase("R")) {
                    System.out.println("Paper Beats Rock Player One wins!");
                } else {
                    System.out.println("Scissors Beats Paper Player Two!");
                }
            } else {
                if (playerTwo.equalsIgnoreCase("S")) {
                    System.out.println("Its a Tie Scissors vs Scissors");
                } else if (playerTwo.equalsIgnoreCase("P")) {
                    System.out.println("Player One wins Scissors beats Paper");
                } else {
                    System.out.println("Player Two wins Rocks Beats Scissors");
                }
            }
            System.out.println("Would you like to play again?");
            play = in.nextLine();
            if (play.equalsIgnoreCase("Y")) {
                playAgain = true;
            }
            else
            {
                playAgain = false;
            }
        }
        while(playAgain);

    }
}