package features.counter.incrementbutton;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import features.counter.CounterModel;
import shared.Controller;

public class IncrementButtonController extends Controller<CounterModel> {
    @FXML private Button incrementButton;

    @Override
    public void initialise(CounterModel model) {
        this.incrementButton.setOnMouseClicked(e -> model.incrementCount());
    }
}
