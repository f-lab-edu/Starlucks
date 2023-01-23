package com.starlucks.menu.domain.entity;

import com.starlucks.common.Codes.Size;

public final class Menu {
    private final Long id;
    private String name;
    private long price;
    private Size size;

    public static Menu from(long id, String menuName, long menuPrice, Size size) {
        return new Menu(id, menuName, menuPrice, size);
    }

    public Menu(Long id, String name, long price, Size size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
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

    public Size getSize() {
        return size;
    }
}
