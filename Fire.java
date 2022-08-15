public class Fire extends Beast{
    private int hp = 1000;
    
    // getter
    public int getHp(){
        return hp;
    }
    // setter
    public void setHp(int remainingHp){
        this.hp = remainingHp;
    }
    
    
    
    
    public Fire(){
        this.hp = hp;
    }
    
    public void hit(){
        hp-=100;
    }
    
    public void hardHit(){
        hp-=250;
    }
    
    public void specialTypeHit(){
        System.out.println("Fire type special move!!");
        hp-=400;
    }
    
    public void heal(){
        hp+=300;
    }
}
