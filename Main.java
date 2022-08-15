import java.util.Scanner;
import java.util.Random;
/**********************************
 NOTES:
    Figure out how to randomize a computer from selecting between the 3 elements.
 
 */




public class Main
{
    // Global Vars
    static boolean gameOver = false;
    static boolean winner = false;
    static String playerBeastName = null;
    
    public static void winner(int theHealth, String playerOrCpu){
        System.out.println("Currently at: " + theHealth);
        if(theHealth <= 0 && playerOrCpu.equals(playerBeastName)){
            System.out.println("WE HAVE A WINNER!");
            winner = true;
            gameOver = true;

        }
    }
    
	public static void main(String[] args) {
	    Fire playerFireBeast = new Fire();
	    //Water playerWaterBeast = new Water();
	    //Earth playerEarthBeast = new Earth();
	    Fire computerFireType = new Fire();
	    //Water computerWaterType = new Water();
	    //Earth computerEarthType = new Earth();
	    
	    String computerBeastName = "CPU";
	    Random rand = new Random();
	    int randomBeastForCPU = rand.nextInt(1)+1; // change to 3
        /*
        if(randomBeastForCPU == 1){
            Fire computerFireType = new Fire();
        }
        */
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("What type of Beast do you want?\n-Fire- -Water- -Earth-");
            String beastChoice = sc.nextLine();
            
            if(beastChoice.equals("fire")){
               // Fire playerBeast = new Fire();
                System.out.println("Youve chosen the fire type beast!");
                System.out.println("What is the name of your beast?");
                playerBeastName = sc.nextLine();
                //System.out.println(playerBeast.getHp());

                
            }else{
                System.out.println("Invalid choice..try again.");
            }
            
            System.out.println("Welcome and enjoy the game " + playerBeastName);

            do{
                System.out.println("Player 1! " + playerBeastName + " it is your turn.");
                System.out.println("\n" + "Player HP: " + playerFireBeast.getHp() + " ---- CPU HP: " + computerFireType.getHp());
                System.out.println("Type a number... (1) to regular hit   (2) to hard hit  (3) to special move hit  (4) to heal yourself");
                int p1Choice = sc.nextInt();
                
                // HUMAN"s turn ---------------
                if(p1Choice == 1){
                    computerFireType.hit();
                    computerFireType.getHp();
                }
                
                winner(computerFireType.getHp(), computerBeastName);
                int randomPowerSelectForCPU = rand.nextInt(4)+1; // change to 4

                // COMPUTER's turn -------------
                if(randomPowerSelectForCPU == 1){
                    playerFireBeast.hit();
                }else if(randomPowerSelectForCPU == 2){
                    playerFireBeast.hardHit();
                }else if(randomPowerSelectForCPU == 3){
                    playerFireBeast.specialTypeHit();
                }else if(randomPowerSelectForCPU == 4){
                    computerFireType.heal();
                }
                
                winner(playerFireBeast.getHp(), playerBeastName);
                
            }while(gameOver != true);
            

        }while(gameOver != true);
        
        
	}
}
