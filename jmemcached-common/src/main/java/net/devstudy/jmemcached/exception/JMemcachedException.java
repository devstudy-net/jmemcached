package net.devstudy.jmemcached.exception;

/**
 * @author devstudy
 * @see http://devstudy.net
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
