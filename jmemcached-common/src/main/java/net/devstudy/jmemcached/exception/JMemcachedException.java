package net.devstudy.jmemcached.exception;

/**
 * Created by devstudy on 1/18/2017.
 */
public class JMemcachedException extends RuntimeException {
    public JMemcachedException(String message) {
        super(message);
    }

    public JMemcachedException(String message, Throwable cause) {
        super(message, cause);
    }

    public JMemcachedException(Throwable cause) {
        super(cause);
    }
}
