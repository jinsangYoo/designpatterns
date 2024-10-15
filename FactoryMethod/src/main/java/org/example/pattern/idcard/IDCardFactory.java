package org.example.pattern.idcard;

import org.example.pattern.framework.Factory;
import org.example.pattern.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private static final String TAG = "IDCardFactory";

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return this.owners;
    }
}
