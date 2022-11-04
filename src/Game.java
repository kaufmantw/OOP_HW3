import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331Bomb;
import fruitNinjaHelper.cs331Fruit;
import fruitNinjaHelper.cs331FruitNinjaGame;

public class Game extends cs331FruitNinjaGame{
    cs331Blade blade;

    // You may need to add constructor
    public Game(){
        //updateChoppable(launchItem());
        this.blade = new cs331Blade(null);
        this.addBlade(blade);
    }

    
    public void updateChoppable(Choppable object) {
        
        // Your code goes here
        if(object instanceof cs331Fruit){
            ((cs331Fruit)object).moveFruit();
        }
        else if (object instanceof Bomb){
            ((Bomb)object).moveBomb();
        }
    }

    @Override
    public Choppable launchItem() {

        // YOUR code goes here
        switch((int)Math.random()*5){
            case 0: 
                Bomb bomb = new Bomb();
                launchHelper(bomb);
                return bomb;

            case 1:
                //fruit 1
                Apple apple = new Apple();
                launchHelper(apple);
                return apple;

            case 2:
                Lemon lemon = new Lemon();
                launchHelper(lemon);
                return lemon;
            
            case 3:
                Peach peach = new Peach();
                launchHelper(peach);
                return peach;

            case 4:
                Pear pear = new Pear();
                launchHelper(pear);
                return pear;
        }
        return null;
    }

    public void launchHelper(Choppable object){     
        if(object instanceof cs331Fruit){
            ((cs331Fruit)object).ripen();
            ((cs331Fruit)object).wash();
        }
        else if (object instanceof Bomb){
            ((Bomb)object).moveBomb();
        }
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
