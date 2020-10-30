package com.goosemagnet.iterator.customiterator;

import java.util.List;

public class PancakeHouseIterator implements Iterator {

    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }
}
