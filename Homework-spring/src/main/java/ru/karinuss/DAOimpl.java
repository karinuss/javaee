package ru.karinuss;

/**
 * Created by karina on 12.10.14.
 */
public class DAOimpl implements DAO {

    @Override
    public void read(String s) {
        System.out.println("read " + s);
    }

    @Override
    public void write(String s) {
        System.out.println("write " + s);
    }
}
