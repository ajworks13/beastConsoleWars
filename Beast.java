abstract class Beast{
    
    public abstract void hit(); // no cooldown
    public abstract void hardHit(); // 1 turn cooldown
    public abstract void specialMoveType(); //3 turn cooldown
    public abstract void heal(); // heal only if all moves are available
    
}
