public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
// クラスによるAdapterパターン
//
// Mainでは、Printインタフェースに従って動作をさせる。
// PrintBannerクラス内に変更が起こってもPrintインタフェースに
// 従った動作ルールさえ変わらなければ影響はない。