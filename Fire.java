public class Fire extends Beast{
    private int hp = 1000;
    private byte hitCooldown = 0;
    
    
    // getter
    public int getHp(){
        return hp;
    }
    // setter
    public void setHp(int remainingHp){
        this.hp = remainingHp;
    }
    
    public byte getCooldownCountDown(){
        return hitCooldown;
    }
    
    
    // constructor
    public Fire(){
        this.hp = hp;
    }
    
    
    
    public void hit(){
        hp-=100;
        checkForCooldown();
    }
    
    public void hardHit(){
        hp-=250;
        checkForCooldown();
    }
    
    public void specialTypeHit(){
        //System.out.println("Fire type special move!!");
        //hp-=400;
        //hitCooldown = 3;
        checkForCooldown();
        
        if(hitCooldown == 0){
            hp-=400;
            hitCooldown = 3;
            System.out.println(" -- Move under cooldown -- : " + hitCooldown);
        }else if(hitCooldown > 0){
            System.out.println(" -- Still under cooldown --");
            hitCooldown-=1;
        }
        
        
    }
    
    public void heal(){
        hp+=300;
        checkForCooldown();
    }
    
    private void checkForCooldown(){
        if(hitCooldown == 0){
            System.out.println("Special move is ready!");
        }
    }
    
    
    
    
    
}
