package org.example.pattern.idcard;

import org.example.pattern.framework.Product;

public class IDCard extends Product {
    private static final String TAG = "IDCard";
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return this.owner;
    }
}
