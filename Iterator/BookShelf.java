import java.util.ArrayList;

public class BookShelf implements Aggregate {
    // private Book[] books; // 本の配列
    private ArrayList<Book> new_books;
    private int last = 0;

    public BookShelf(int maxsize) {
        // this.books = new Book[maxsize];
        this.new_books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        // return this.books[index];
        return this.new_books.get(index);
    }

    public int appendBook(Book book) {
        this.new_books.add(book);
        // this.books[last] = book;
        return this.last++;
    }

    public int getLength() {
        return this.last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
// BookShelfクラス
// 本棚を表現しているクラス。このクラスを集合体として扱うためにAggregateインタフェースの
// iteratorを実装している。iteratorを実装する中で、BookShelfIteratorにBookShelfクラスの実態を与え
// 操作できるようにする。この本棚の本を数え上げたいときに、このBookShelfIteratorのインスタンスを
// 使ってメソッドを呼び出します。