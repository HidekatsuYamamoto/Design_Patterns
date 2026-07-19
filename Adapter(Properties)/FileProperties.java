import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

public class FileProperties extends FileIO {
    private Properties properties;
    private String file_path = new String("java.properties");

    public FileProperties() {
        // super(string);
        this.properties = new Properties();
    }

    public FileProperties(String string) {
        // super(string);
        this.properties = new Properties();
        this.file_path = string;
    }

    @Override
    public void load() {
        try {
            InputStream istream = new FileInputStream(file_path);
            this.properties.load(istream);
            istream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void store() {
        // 書き込み
        this.properties.setProperty("id", "SAMURAI2");
        this.properties.setProperty("pass", "ENGINEER2");
        try {
            this.properties.store(new FileOutputStream(file_path), "Comments");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Adapterの役目を果たすもの。
// Printのインタフェースをもち、Bannerクラスを継承し、機能を呼び出す。