package ru.karinuss;

/**
 * Created by karina on 21.10.14.
 */
public class Region {

    private String name;
    private Long id;

    public Region(String name) {
        this.name = name;
        this.id = 0L;
    }

    public Region(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
