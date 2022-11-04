import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Peach extends cs331Fruit implements Choppable{

    private static final int SCORE = 5;

    public Peach(){
        this.setImage(Constants.PEACH_PATH);
        this.wash();
        this.ripen();
    }
    public void chop(){
        this.splash();
        this.chopGraphically();
    }

    @Override
    public void moveObject(){
        this.moveFruit();
    }

    @Override
    public int getScore(){
        return SCORE;
    }
    
}