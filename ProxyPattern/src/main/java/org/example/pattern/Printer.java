package org.example.pattern;

import org.example.pattern.myInterface.Printable;

public class Printer implements Printable {
    private static final String TAG = "Printer";

    private String name;

    public Printer() {
        heavyJob("Printer의 인스턴스 생성 중");
    }
    public Printer(String name) {
        this.name = name;
        heavyJob("Printer의 인스턴스 (" + name + ")을 생성 중");
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; ++i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("완료.");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + this.name + " ===");
        System.out.println(string);
    }
}
