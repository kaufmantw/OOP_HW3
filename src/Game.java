import fruitNinjaHelper.cs331FruitNinjaGame;

public class Game extends cs331FruitNinjaGame{

    // You may need to add constructor
    public Game(){
        updateChoppable(launchItem());
    }

    
    public void updateChoppable(Object object) {
        
        // Your code goes here
        
    }

    @Override
    public Object launchItem() {

        // YOUR code goes here
        switch((int)Math.random()*5){
            case 0: 
                //bomb
                break;

            case 1:
                //fruit 1
                Apple fruit = new Apple();
                fruit.wash();
                fruit.ripen();
                return fruit;

            case 2:
                //fruit 2
                break;
            
            case 3:
                //fruit 3
                break;

            case 4:
                //fruit 4
                break;
        }
        return null;
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
