import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Lemon extends cs331Fruit implements Choppable{

    public Lemon(){
        this.setImage(Constants.LEMON_PATH);
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