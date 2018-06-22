package top.huangwenren.exception;

/**
 * Created by huang on 2017/3/13.
 */
public class ExceptionStackFull extends RuntimeException {
    public ExceptionStackFull(String error) {
        super(error);
    }
}
