package top.huangwenren.stack;

import top.huangwenren.exception.ExceptionStackEmpty;

/**
 * Created by huang on 2017/3/13.
 */
public interface Stack {
    /**
     * 入栈
     * @param object
     */
    public void push(Object object);

    /**
     * 出栈
     * @return
     */
    public Object pop() throws ExceptionStackEmpty;

    /**
     * 获取栈顶元素（但不删除）
     * @return
     */
    public Object top() throws ExceptionStackEmpty;

    /**
     * 获取栈中元素数目
     * @return
     */
    public int getSize();

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty();
}
