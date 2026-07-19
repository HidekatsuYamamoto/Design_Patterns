・Iterator 
練習問題
〇問題１－１
サンプルプログラムのBookShelfクラスでは、
最初に指定した本棚の大きさを超えて、本を入れることができません。
本棚の大きさを超えても本を追加できるようにしてください。
java.util.ArrayList

・Adapter
〇問題２－２
java.util.Propertiesクラスは、
year=2004
month=4
day=21
のような、キーとその値の組（プロパティ）を管理するためのものです。
java.util.Propertiesクラスには、プロパティをストリームより読み込んだり、ストリームに書いたりするために、
次のメソッドが用意されています。

void load(InputStream in) throws IOException
プロパティの集合をInputStreamから読み込む

void store(OutputStream out, String header) throws IOException
プロパティの集合をOutputStreamに書き込む。headerはコメント

<お題>
Adapterパターンを使って、プロパティの集合をファイルに保存するFilePropertiesクラスを作ってください。
