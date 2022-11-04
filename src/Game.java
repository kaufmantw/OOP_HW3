import fruitNinjaHelper.cs331Blade;
import fruitNinjaHelper.cs331Bomb;
import fruitNinjaHelper.cs331Fruit;
import fruitNinjaHelper.cs331FruitNinjaGame;
import fruitNinjaHelper.cs331ScoreController;

public class Game extends cs331FruitNinjaGame{
    cs331Blade blade;
    cs331ScoreController control;

    // You may need to add constructor
    public Game(cs331ScoreController controller){
        //updateChoppable(launchItem());
        this.blade = new cs331Blade(null);
        this.control = controller;
        this.addBlade(blade);
    }

    
    public void updateChoppable(Choppable object) {
        
        // Your code goes here
        /* 
        if(object instanceof cs331Fruit){
            ((cs331Fruit)object).moveFruit();
        }
        else if (object instanceof Bomb){
            ((Bomb)object).moveBomb();
        } */
        object.moveObject();
 
        if (this.blade.checkIntersection(object)){
            object.chop();
            control.addToScore(5);
        }
    }

    @Override
    public Choppable launchItem() {

        // YOUR code goes here
        switch((int)(Math.random()*5)){
            case 0: 
                Bomb bomb = new Bomb();
                return bomb;

            case 1:
                //fruit 1
                Apple apple = new Apple();
                return apple;

            case 2:
                Lemon lemon = new Lemon();
                return lemon;
            
            case 3:
                Peach peach = new Peach();
                return peach;

            case 4:
                Pear pear = new Pear();
                return pear;
        }
        return null;
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}
