import fruitNinjaHelper.Constants;
import fruitNinjaHelper.cs331Fruit;

public class Peach extends cs331Fruit implements Choppable{

    public Peach(){
        this.setImage(Constants.PEACH_PATH);
    }
    public void chop(){
        this.splash();
        this.chopGraphically();
    }
    
}