package pl.sda.ex5;

import java.util.HashSet;

public class SDAHashset<E> extends HashSet {

    private int operationCounter = 0;

    @Override
    public void boolean add(E e) {
        operationCounter++;
        return super.contains(e);
    }
    @Override
    public void size() {
        operationCounter++;
        return super.size(e);
    }


}
