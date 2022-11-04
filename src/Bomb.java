import fruitNinjaHelper.cs331Bomb;

public class Bomb extends cs331Bomb implements Choppable{
    
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
}