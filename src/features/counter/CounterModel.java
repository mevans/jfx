package features.counter;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.SimpleIntegerProperty;

public class CounterModel {
    private SimpleIntegerProperty count = new SimpleIntegerProperty(0);

    public final int getCount() {
        return this.count.get();
    }

    public void incrementCount() {
        this.count.set(this.getCount() + 1);
    }

    public StringExpression getText() {
        return Bindings.concat("The button has been clicked: ", count.asString(), " times");
    }
}
