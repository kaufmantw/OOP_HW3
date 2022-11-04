import fruitNinjaHelper.cs331Fruit;
import fruitNinjaHelper.Constants;

public class Apple extends cs331Fruit implements Choppable{
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
}