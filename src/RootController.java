import features.counter.CounterModel;
import features.counter.display.DisplayController;
import features.counter.incrementbutton.IncrementButtonController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {
    @FXML private DisplayController displayController;
    @FXML private IncrementButtonController incrementButtonController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CounterModel model = new CounterModel();
        displayController.initialise(model);
        incrementButtonController.initialise(model);
    }
}
