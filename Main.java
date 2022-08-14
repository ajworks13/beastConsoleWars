import java.util.Scanner;
import java.util.Random;
/**********************************
 NOTES:
    Figure out how to randomize a computer from selecting between the 3 elements.
 
 */

public class Main
{
	public static void main(String[] args) {
	    Fire playerFireBeast = new Fire();
	    //Water playerWaterBeast = new Water();
	    //Earth playerEarthBeast = new Earth();
	    Fire computerFireType = new Fire();
	    //Water computerWaterType = new Water();
	    //Earth computerEarthType = new Earth();
	    
	    boolean gameOver = false;
	    String playerBeastName = null;
	    //String computerType;
	    String computer = "CPU";
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
            
            
            do{
                System.out.println("Welcome and enjoy the game " + playerBeastName);
                System.out.println("Player 1! " + playerBeastName + " it is your turn.");
                System.out.println("\n" + "Player HP: " + playerFireBeast.getHp() + " ---- CPU HP: " + computerFireType.getHp());
                System.out.println("Type a number... (1) to regular hit   (2) to hard hit  (3) to special move hit  (4) to heal yourself");
                int p1Choice = sc.nextInt();
                
                if(p1Choice == 1){
                    
                }
            }while(gameOver != true);
            

        }while(gameOver != true);
        
        
	}
}
