import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Pear extends cs331Fruit implements Choppable{

    public Pear(){
        this.setImage(Constants.PEAR_PATH);
    }
    @Override
    public void chop(){
        this.splash();
    }
    
}