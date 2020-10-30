package com.goosemagnet.iterator.refactored.cafemenu;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
