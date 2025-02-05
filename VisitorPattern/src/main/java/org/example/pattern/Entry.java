package org.example.pattern;

import java.util.Iterator;

public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

//    public void printList() {
//        printList("");
//    }
//
//    protected abstract void printList(String preFix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
