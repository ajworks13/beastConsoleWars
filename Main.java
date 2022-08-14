import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
	    boolean gameOver = false;
	    String computerType;
	    String computer = "CPU";
	    Random rand = new Random();
	    int randomBeastForCPU = rand.nextInt(3)+1;
	    
        if(randomBeastForCPU == 1){
            computerType = "fire";
        }
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("What type of Beast do you want?\n-Fire- -Water- -Earth-");
            String beastChoice = sc.nextLine();
            
            if(beastChoice.equals("fire")){
                System.out.println("Youve chosen the fire type beast!");
                System.out.println("What is the name of your beast?");
                String playerBeastName = sc.nextLine();
            }else{
                System.out.println("Invalid choice..try again.");
            }
            

        }while(gameOver != true);
        
        
	}
}
