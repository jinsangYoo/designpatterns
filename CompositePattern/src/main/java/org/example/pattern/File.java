package org.example.pattern;

public class File extends Entry {
    private static final String TAG = "File";

    private String name;
    private int size;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String preFix) {
        System.out.println(preFix + "/" + this);
    }
}
