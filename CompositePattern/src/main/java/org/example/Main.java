package org.example;

import org.example.pattern.Directory;
import org.example.pattern.File;
import org.example.pattern.FileTreatmentException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));
            rootDir.printList();

            System.out.println("Making user entries...");
            Directory kimDir = new Directory("Kim");
            Directory leeDir = new Directory("Lee");
            Directory parkDir = new Directory("Park");
            usrDir.add(kimDir);
            usrDir.add(leeDir);
            usrDir.add(parkDir);
            kimDir.add(new File("diary.html", 100));
            kimDir.add(new File("Composite.java", 200));
            leeDir.add(new File("memo.tex", 300));
            parkDir.add(new File("game.doc", 400));
            parkDir.add(new File("junk.mail", 500));
            rootDir.printList();
        }
        catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}