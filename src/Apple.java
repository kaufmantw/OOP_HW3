import fruitNinjaHelper.cs331Fruit;
import fruitNinjaHelper.Constants;

public class Apple extends cs331Fruit implements Choppable{

    private static final int SCORE = 5;

    public Apple(){
        this.setImage(Constants.APPLE_PATH);
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