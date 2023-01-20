package com.starlucks.menu.domain.entity;

public class Menu {
    private final Long id;
    private String name;
    private long price;

    public static Menu from(long id, String menuName, long menuPrice) {
        return new Menu(id, menuName, menuPrice);
    }

    public Menu(Long id, String name, long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }
}
