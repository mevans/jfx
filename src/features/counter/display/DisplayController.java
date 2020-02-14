package features.counter.display;

import features.counter.CounterModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import shared.Controller;

public class DisplayController extends Controller<CounterModel> {
    @FXML private Label counter;

    @Override
    public void initialise(CounterModel model) {
        this.counter.textProperty().bind(model.getText());
    }
}
