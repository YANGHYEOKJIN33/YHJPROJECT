import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawLinesController {
	@FXML
	private Canvas canvas;

	@FXML
	void drawLinesButtonPressed(ActionEvent event) {
		GraphicsContext gc = canvas.getGraphicsContext2D();

		double incrementWidth = canvas.getWidth() / 20;
		double incrementHeight = canvas.getHeight() / 20;

		int linesCounter = 0;
		while (linesCounter < 20) {
			gc.strokeLine(0, 0, incrementWidth * linesCounter, canvas.getHeight() - incrementHeight * linesCounter);
			linesCounter++;
		}
	}

}