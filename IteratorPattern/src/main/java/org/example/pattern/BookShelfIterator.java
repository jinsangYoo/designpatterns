package org.example.pattern;

import org.example.pattern.myinterface.Iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(this.index);
        this.index++;

        return book;
    }
}
