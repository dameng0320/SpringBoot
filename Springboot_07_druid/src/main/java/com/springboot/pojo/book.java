package com.springboot.pojo;

public class book {

    private int id;

    private String name;

    private String type;

    private String brief;

    public book(int id, String name, String type, String brief) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.brief = brief;
    }

    public book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @Override
    public String  toString() {
        return "book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", brief='" + brief + '\'' +
                '}';
    }
}
