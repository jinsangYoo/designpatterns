package org.example.pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private static final String TAG = "Directory";

    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    public Iterator iterator() {
        return directory.iterator();
    }

//    @Override
//    protected void printList(String preFix) {
//        System.out.println(preFix + "/" + this);
//        Iterator it = directory.iterator();
//        while (it.hasNext()) {
//            Entry entry = (Entry)it.next();
//            entry.printList(preFix + "/" + name);
//        }
//    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
