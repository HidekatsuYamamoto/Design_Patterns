public class BookShelfIterator implements Iterator {
    private BookShelf bookshelf; // 本棚
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookshelf = bookShelf; // コンストラクタで本棚をフィールドにセット
        this.index = 0;
    }

    public boolean hasNext() {
        if (this.index < this.bookshelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() { // 次のbook要素を返す。
        Book book = this.bookshelf.getBookAt(this.index);
        this.index++;
        return book;
    }
}
// BookShelfIteratorクラス
// (ConcreteIterator)
// BookShelfクラスに対応するIterator。
// BookShelfクラスの本を数えるときに、このメソッドを呼ぶ。
// Iteratorが定めたインタフェースを実際に実装する。
