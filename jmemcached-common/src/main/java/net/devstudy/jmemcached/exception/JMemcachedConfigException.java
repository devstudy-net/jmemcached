package net.devstudy.jmemcached.exception;

/**
 * Created by devstudy on 1/18/2017.
 */
public class JMemcachedConfigException extends JMemcachedException {
    public JMemcachedConfigException(String message) {
        super(message);
    }

    public JMemcachedConfigException(String message, Throwable cause) {
        super(message, cause);
    }
}
