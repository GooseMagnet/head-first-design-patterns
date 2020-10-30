package com.goosemagnet.iterator.cafemenu;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
