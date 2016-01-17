import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Test extends Application {
	
	public static void main(String[] args) {
		Application.launch();
	}

	@Override
	public void start(Stage stage) throws Exception {

			
		Button b = new Button("Servus");
		HBox h = new HBox(b);
		h.setMaxHeight(100);
		b.setMaxSize(80, 50);
		Scene s = new Scene(h, 300, 200);
		
		stage.setScene(s);
		stage.show();
		
		// Wolfgang
		
	}

}
