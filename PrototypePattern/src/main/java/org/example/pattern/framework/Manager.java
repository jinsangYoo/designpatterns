package org.example.pattern.framework;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product)showcase.get(protoName);
        return p.createClone();
    }
}
