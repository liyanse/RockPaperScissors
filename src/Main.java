import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static int playerWins, computerWins; //Global variables, can be accessible from anywhere in the class

    public static void main(String[] args) {

        out.println("Welcome to Rock Paper Scissors." +
                "\n\nWhat's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        out.println("Hello: "+ name+"\n You will play against the computer \n Choose:" +
                "\n 1 - Rock\n 2 - Paper\n 3 - Scissors");
        while (true){
            Random random = new Random();
            int computerChoice = random.nextInt(3)+1;
            out.println("Enter your choice:");
            int userChoice = scanner.nextInt();

            out.println("Computer chose:" + choice(computerChoice));
            out.println("Player chose:" + choice(userChoice));

            determineWinner(computerChoice,userChoice,name);

            if (playerWins ==3){
                out.println(name+" wins best of three ");
                break;
            }
            if (computerWins == 3){
                out.println("Computer wins best of three");
                break;
            }
        }
    }
    public static String choice(int receivedNumber){

        switch (receivedNumber){
            case 1:
                return "Rock";
                //When you use the return statement you don't need to call the break statement in switch cases.
                //break;
            case 2:
                return "Paper";
              //  break;
            case 3:
                return "Scissors";
             //   break;
            default:
                return "Invalid Choice";

        }
    }
    public static void determineWinner(int computerChoice, int userChoice, String name){
         //we have to declare these as parameters because they are accessible only to the main function.
        if (computerChoice == userChoice){
            out.println("It was a draw, you both chose the same value");
        }
        if (computerChoice == 1 && userChoice ==2 ){
            playerWins++;
            out.println(name+" won because paper wraps rock ");
        }
        if (computerChoice == 1 && userChoice ==3){
            out.println("Computer won because rock crashes scissors");
            computerWins++;
        }
        if (computerChoice == 2 && userChoice == 1){
            out.println(" Computer won because paper wraps rock ");
            computerWins++;
        }
        if (computerChoice == 2 && userChoice ==3){
            out.println( name+ " won because because scissors cuts paper");
            playerWins++;
         }
        if (computerChoice == 3 && userChoice == 1){
            out.println(name+ " won because rock crashes scissors ");
            playerWins++;
        }
        if (computerChoice == 3 && userChoice ==2){
            out.println( "Computer won because scissors cuts paper");
            computerWins++;
        }
        out.println("Computer has " +computerWins + " wins");
        out.println(name+ " has "+ playerWins +" wins");
    }
    }
