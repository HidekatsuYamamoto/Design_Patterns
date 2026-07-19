import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

public class FileProperties extends FileIO {
    private Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    // new
    @Override
    public void readFromFile(String filename) throws IOException {
        try {
            InputStream istream = new FileInputStream(filename);
            this.properties.load(istream);
            istream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        try {
            this.properties.store(new FileOutputStream(filename), "written by FileProperties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    };

    @Override
    public void setValue(String key, String value) {
        this.properties.setProperty(key, value);
    };

    @Override
    public String getValue(String key) {
        return this.properties.getProperty(key);

    };
}

// Adapterの役目を果たすもの。
// Printのインタフェースをもち、Bannerクラスを継承し、機能を呼び出す。