package org.jarexplorer;


import jfk.prism.*;

public class ClassHolder {
    public ICallable getCallable() {
        return callable;
    }

    public Description getDescription() {
        return description;
    }

    ICallable callable;
    Description description;

    public String getName() {
        return name;
    }

    String name;

    public ClassHolder(ICallable callable, Description description, String name) {
        this.callable = callable;
        this.description = description;
        this.name = name;
    }
}
