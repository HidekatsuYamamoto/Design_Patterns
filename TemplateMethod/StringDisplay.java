public class StringDisplay extends AbstractDisplay {
    private String str = new String("");

    public StringDisplay(String str) {
        this.str = str;
        return;
    }

    void repeatString() {
        System.out.print("+");
        for (int i = 0; i < this.str.getBytes().length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        return;
    }

    @Override
    public void open() {
        repeatString();
        return;
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
        return;
    }

    @Override
    public void close() {
        repeatString();
        return;
    }
}
