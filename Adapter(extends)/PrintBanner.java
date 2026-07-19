public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}

// Adapterの役目を果たすもの。
// Printのインタフェースをもち、Bannerクラスを継承し、機能を呼び出す。