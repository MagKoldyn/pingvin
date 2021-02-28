package com.vladik.pingvin;

import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main extends JavaFxSpringIntegrator{

	@Override
	public void start(Stage primaryStage) throws Exception {
		super.start(primaryStage);
	}

	@Override
	public void init() throws Exception {
		super.init();
	}

	public static void main(String[] args) {
		// старт приложения
		launchSpringJavaFXApp(Main.class, args);
	}


	@Override
	public void stop() throws Exception {
		System.exit(0);
	}

}
