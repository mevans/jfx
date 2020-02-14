package shared.models;

import javafx.beans.property.*;

import java.util.Date;

public class Impression {
    private Property<Date> date;
    private IntegerProperty id;
    private StringProperty gender;
    private IntegerProperty age;
    private IntegerProperty income;
    private StringProperty context;
    private DoubleProperty impressionCost;

    public Impression(Date date, int id, String gender, int age, int income, String context, double impressionCost) {
        this.date = new SimpleObjectProperty<>(date);
        this.id = new SimpleIntegerProperty(id);
        this.gender = new SimpleStringProperty(gender);
    }
}
