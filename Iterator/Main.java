// import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf(4);

        bookshelf.appendBook(new Book("A"));
        bookshelf.appendBook(new Book("B"));
        bookshelf.appendBook(new Book("C"));
        bookshelf.appendBook(new Book("D"));

        Iterator it = bookshelf.iterator();
        // BookShelfIteratorのインスタンスをゲット。共通のIterator型にすることで共通化できる。
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
