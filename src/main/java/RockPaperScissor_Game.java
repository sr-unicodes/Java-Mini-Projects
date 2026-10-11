
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor_Game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        //rock paper scissor game

        //declare var

        String[]choices = {"rock","paper","scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain ="yes";

        do {
            System.out.print("Enter your move (rock,paper,scissor) : ");
            playerChoice = scanner.nextLine().toLowerCase();
            //get choice from user
            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissor")) {
                System.out.println("invalid choice");
                continue;
            }
            //get random choice from comp
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice:"+ computerChoice);
            //check win cond
            if (playerChoice.equals(computerChoice)){
                System.out.println("it's a tie! ");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissor")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    playerChoice.equals("scissor") && computerChoice.equals("paper"))  {
                System.out.println("you win ! ");

            }else{
                System.out.println("you lose ! ");
            }
            //ask to play again
            while(true) {
                System.out.print("play again (yes/no): ");
                playAgain = scanner.nextLine().toLowerCase().trim();

                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    break;
                } else {
                    System.out.println("invalid choice use yes or no ");
                }
            }
            System.out.println();


        }while(playAgain.equals("yes"));
        //goodbye mesg
        System.out.println("Thanks for playing ! ");


        scanner.close();
    }
}


