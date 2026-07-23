public class Main {
    public static void main(String[] args) {
        CharDisplay d1 = new CharDisplay('H');
        StringDisplay d2 = new StringDisplay("Hello, world.");
        StringDisplay d3 = new StringDisplay("こんにちは。　");

        d1.display();
        d2.display();
        d3.display();

        return;
    }
}