package org.example.pattern.myInterface;

import org.example.pattern.NumberGenerator;

public interface Observer {
    public abstract void update(NumberGenerator generator);
}
