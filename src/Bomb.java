import fruitNinjaHelper.cs331Bomb;

public class Bomb extends cs331Bomb implements Choppable{

    private static final int SCORE = 0;
    
    public Bomb(){
        this.setImage();
        
    }

    @Override
    public void chop(){
        this.explode();
    }

    @Override
    public void moveObject(){
        this.moveBomb();
    }

    @Override
    public int getScore(){
        return SCORE;
    }
}