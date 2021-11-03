# RockPaperScissors
The game is as simple as the original rock paper scissors, however this time there are some ground rules.
For example, the game will continue until either the computer or players scores three wins, that is the best of 3
Additionally, the game will employ the same rules as that to the original game
We begin by welcoming the player and introducing them to the game
We also share the rules and let them know their opponent will be the computer

    public class Main {
        public static int playerWins, computerWins; //Global variables, can be accessible from anywhere in the class

        public static void main(String[] args) {

            out.println("Welcome to Rock Paper Scissors." +
                    "\n\nWhat's your name?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            out.println("Hello: "+ name+"\n You will play against the computer \n Choose:" +
                    "\n 1 - Rock\n 2 - Paper\n 3 - Scissors");
                    
As you can see in the above code, we have a called two global functions that is Player and ComputerWins, these two can be accessed anywhere in the code with any class.
The reason for such a step is because we will be using functions to ease the functionality of the code and that will have us to declare the global variables beforehand.
The next step is to create a loop used that will keep the program in a continous cycle until there is a winner who scores 3 wins. 
In the loop, we will also have the computer generating a random number in between 1-3 to help the system play and prompt the user to pick their number.
In short, this loop coveres the most important segement of the code.


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
              
 The next step is to create a function that will assogn values to the three choices of the computer and user. For this we will use a switch case 
 When developing this game I had so much assistance from a friend and I learnt that when we use a return statement in a switch case then we never need to break the case
 The return acts as the break statement for the system
 
       public static String choice(int receivedNumber){

              switch (receivedNumber){
                  case 1:
                      return "Rock";
                  case 2:
                      return "Paper";
                  case 3:
                      return "Scissors";
                  default:
                      return "Invalid Choice";

              }
          }
 The final part of the code is a function that creates statements for possible choices made by the user and computer. For example
 If a player and computer select the same number, the program should consider that a draw and not a win to either of them
 Additionally at the end of each game, the players will be informed of their wins.
 
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
