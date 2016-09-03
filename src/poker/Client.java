/**
 * @author Ben Huang <bhuang0419@gmail.com>
 * @version 0.01
 * @since 0.00
 * 
 * Client.java for Poker.
 */

package poker;

import lento.util.time.TimeStamp;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Client extends Application {
	private static final int windowWidth = 500;
	private static final int windowHeight = 550;
	
	@Override
	public void start(Stage primaryStage) {
		MenuBar menuBar = new MenuBar();
		
			Menu menuGame = new Menu("Game");
				MenuItem menuItemNewGame = new MenuItem("New Game");
				MenuItem menuItemExit = new MenuItem("Exit");
				menuItemNewGame.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent a) {
						System.out.println("LOL");
					}
				});
				
				menuItemExit.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent a) {
						System.out.println("[" + new TimeStamp() + "]" + " Closing game..");
						System.exit(0);
					}
				});
				
				menuGame.getItems().addAll(menuItemNewGame, new SeparatorMenuItem(), menuItemExit);
			
			Menu menuView = new Menu("View");
				CheckMenuItem checkMenuItemCards = new CheckMenuItem("Cards");
				checkMenuItemCards.setSelected(true);
				checkMenuItemCards.selectedProperty().addListener(new ChangeListener<Boolean>() {
					public void changed(ObservableValue observable, Boolean oldValue, Boolean newValue) {
							checkMenuItemCards.setSelected(newValue);
					}
				});
				
				menuView.getItems().add(checkMenuItemCards);
			
			Menu menuHelp = new Menu("Help");
				MenuItem menuItemHelp = new MenuItem("Help");
				menuItemHelp.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent a) {
						
					}
				});
			
			
		menuBar.getMenus().addAll(menuGame, menuView, menuHelp);
		
		VBox rootPane = new VBox();
		
		GridPane titlePane = new GridPane();
		GridPane main = new GridPane();
		
		titlePane.setAlignment(Pos.TOP_CENTER);
		titlePane.setPadding(new Insets(10, 0, 10, 0));
		
		main.setAlignment(Pos.CENTER_LEFT);
		main.setPadding(new Insets(10));
		main.setHgap(5);
		
		Text titleText = new Text("Poker");
		Label l1 = new Label("Bitch ass, punk ass, nigga.");
		Label l2 = new Label("Pussy bitch.");
		Label l3 = new Label("Suck that bitches DICK.");
		
		Font titleFont = Font.font("Courier", FontWeight.BOLD, FontPosture.REGULAR, 36);
		titleText.setFont(titleFont);
		
		titlePane.getChildren().add(titleText);
		rootPane.getChildren().addAll(menuBar, titlePane, main);
		main.add(l1, 0, 1);
		main.add(l2, 0, 2);
		main.add(l3, 0, 4);
		
		
		Scene mainScene = new Scene(rootPane, windowWidth, windowHeight);
		
		
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("Poker");
		primaryStage.show();
	}
	
	public static final void run() {
		Application.launch();
	}
}