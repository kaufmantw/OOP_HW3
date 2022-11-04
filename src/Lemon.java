import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Lemon extends cs331Fruit implements Choppable{

    public Lemon(){
        this.setImage(Constants.LEMON_PATH);
    }
    
    @Override
    public void chop(){
        this.splash();
        this.chopGraphically();
    }
}