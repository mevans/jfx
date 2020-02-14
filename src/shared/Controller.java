package shared;

public abstract class Controller<T> {
    private T model;

    public void initModel(T model) {
        if (this.model != null) throw new IllegalStateException("Model can only be initialized once");
        this.model = model;

        this.initialise(model);
    }

    public abstract void initialise(T model);
}
