import java.util.Scanner;
import java.util.Random;
/**********************************
 NOTES:
    Give the moves cooldowns.
 */




public class Main
{
    // Global Vars
    static boolean gameOver = false;
    static boolean winner = false;
    static String playerBeastName = null;   
    static String computerBeastName = "CPU";
    static int p1Mistake = -1;

    
    public static void winner(int theHealth, String playerOrCpu){
       // System.out.println("Currently at: " + theHealth);
        if(theHealth <= 0 && playerOrCpu.equals(playerBeastName)){
            System.out.println("WE HAVE A WINNER! - " + computerBeastName);
            winner = true;
            gameOver = true;

        }else if(theHealth <= 0 && playerOrCpu.equals(computerBeastName)){
            System.out.println("WE HAVE A WINNER! - " + playerBeastName);
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
                System.out.println("Cooldown: " + playerFireBeast.getCooldownCountDown());
                System.out.println("Player 1! " + playerBeastName + " it is your turn.");
                System.out.println("\n" + "Player HP: " + playerFireBeast.getHp() + " ---- CPU HP: " + computerFireType.getHp());
                System.out.println("Type a number... (1) to regular hit   (2) to hard hit  (3) to special move hit  (4) to heal yourself");
                int p1Choice = sc.nextInt();
                
                
                // HUMAN"s turn ---------------
                if(p1Choice == 1){
                    computerFireType.hit();
                    //computerFireType.getHp();
                }else if(p1Choice == 2){
                    computerFireType.hardHit();
                }else if(p1Choice == 3){
                    computerFireType.specialTypeHit();
                }else if(p1Choice == 4){
                    playerFireBeast.heal();
                }else{
                    do{
                        System.out.println("Invalid move.. select from 1 - 4\n");
                        p1Mistake = sc.nextInt();
                    }while(p1Mistake >= 4 || p1Mistake < 1);
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
