import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Pear extends cs331Fruit implements Choppable{

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
    
}