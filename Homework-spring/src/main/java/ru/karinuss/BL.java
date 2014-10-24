package ru.karinuss;

/**
 * Created by karina on 12.10.14.
 */

public class BL {

    private String name = "tux";
    private DAO dao;

    public DAO getDao() {
        return dao;
    }

    public void setDao(DAO dao) {
        this.dao = dao;
    }

    public BL() {
    }

    public BL(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BL{" +
                "name='" + name + '\'' +
                ", dao=" + dao +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
