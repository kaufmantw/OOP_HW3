import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Pear extends cs331Fruit implements Choppable{

    private static final int SCORE = 5;

    public Pear(){
        this.setImage(Constants.PEAR_PATH);
        this.wash();
        this.ripen();
    }
    @Override
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