import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("day", "21");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.writeToFile("newfile.txt");
            // System.out.println(f.getValue("year")); // for debug
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// クラスによるAdapterパターン
//
// Mainでは、Printインタフェースに従って動作をさせる。
// PrintBannerクラス内に変更が起こってもPrintインタフェースに
// 従った動作ルールさえ変わらなければ影響はない。