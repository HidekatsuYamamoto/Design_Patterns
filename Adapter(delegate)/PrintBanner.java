public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        // super(string);
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();
    }
}

// Adapterの役目を果たすもの。
// Printのインタフェースをもち、Bannerクラスを継承し、機能を呼び出す。