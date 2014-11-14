package ru.karinuss;

/**
 * Created by karina on 03.10.14.
 */

//todo add annotations
public class VendingMachine {
    String type;

    public VendingMachine(String type) {
        this.type = type;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VendingMachine with type='" + type + '\'';
    }
}
