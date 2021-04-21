package view.adminuser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoaderAdminLogin extends Application{
	
	private static final String PER_ADMINLOGIN ="/layouts/AdminLogin.fxml";
	
	@Override
	public void start(Stage stage)  {
		    try {
		       Parent root = FXMLLoader.load(getClass().getResource(PER_ADMINLOGIN));
		     
		        Scene scene = new Scene(root, 600, 500);
		    
		        stage.setTitle("Sedibus");
		        stage.setScene(scene);
		        stage.show();
		    } catch(Exception e) {
		    	e.printStackTrace();
		    }
	}
	

}
