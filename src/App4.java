import fruitNinjaHelper.cs331FruitNinjaFrame;
import fruitNinjaHelper.cs331FruitNinjaGame;
import fruitNinjaHelper.cs331ScoreController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App4 extends Application{

    public void start(Stage primaryStage) {
        cs331FruitNinjaFrame frame = new cs331FruitNinjaFrame(primaryStage);
        cs331ScoreController controller = new cs331ScoreController();
        
        // Your code goes here!!
        Game game = new Game(controller);
        frame.addGame(game);
        frame.setTop(controller);
        game.startGame();
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
