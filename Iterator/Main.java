// import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf(4);

        bookshelf.appendBook(new Book("A"));
        bookshelf.appendBook(new Book("B"));
        bookshelf.appendBook(new Book("C"));
        bookshelf.appendBook(new Book("D"));
        bookshelf.appendBook(new Book("E"));
        bookshelf.appendBook(new Book("F"));
        bookshelf.appendBook(new Book("G"));
        bookshelf.appendBook(new Book("H"));
        bookshelf.appendBook(new Book("I"));
        bookshelf.appendBook(new Book("J"));
        bookshelf.appendBook(new Book("K"));
        bookshelf.appendBook(new Book("L"));
        bookshelf.appendBook(new Book("M"));
        bookshelf.appendBook(new Book("N"));
        bookshelf.appendBook(new Book("O"));
        bookshelf.appendBook(new Book("P"));

        Iterator it = bookshelf.iterator();
        // BookShelfIteratorのインスタンスをゲット。共通のIterator型にすることで共通化できる。
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
