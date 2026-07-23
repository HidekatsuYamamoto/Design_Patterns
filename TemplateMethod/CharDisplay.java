public class CharDisplay extends AbstractDisplay {
    private char c_str = 0x00;

    public CharDisplay(char str) {
        this.c_str = str;
        return;
    }

    @Override
    public void open() {
        System.out.print("<<");
        return;
    }

    @Override
    public void print() {
        System.out.print(c_str);
        return;
    }

    @Override
    public void close() {
        System.out.println(">>");
        return;
    }
}