package top.huangwenren.exception;

/**
 * Created by huang on 2017/3/13.
 */
public class ExceptionStackEmpty extends RuntimeException {
    public ExceptionStackEmpty(String error) {
        super(error);
    }
}
