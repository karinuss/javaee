package ru.karinuss;

import java.util.List;

/**
 * Created by karina on 03.10.14.
 */

//todo add annotations
public class BusinessCenter {

    String address;
    List<VendingMachine> vendingMachineList;

    public BusinessCenter(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "BusinessCenter at " + address;
    }
}
