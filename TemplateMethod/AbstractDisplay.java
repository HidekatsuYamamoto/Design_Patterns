public abstract class AbstractDisplay {

    public void display() {
        open();

        for (int i = 0; i < 5; i++) {
            print();
        }

        close();

        return;
    };

    public abstract void open();

    public abstract void print();

    public abstract void close();
}