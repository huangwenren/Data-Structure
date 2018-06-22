package top.huangwenren.stack;

import top.huangwenren.exception.ExceptionStackEmpty;


/**
 * Created by huang on 2017/3/13.
 */
public class ArrayStack implements Stack{
    private static final int DEFAULT_CAPACITY = 1024;
    private int capacity;
    private Object[] s;
    private int top = -1;

    public ArrayStack() {
        s = new Object[DEFAULT_CAPACITY];
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;

    }

    @Override
    public void push(Object object) {

    }

    @Override
    public Object pop() throws ExceptionStackEmpty {
        return null;
    }

    @Override
    public Object top() throws ExceptionStackEmpty {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
