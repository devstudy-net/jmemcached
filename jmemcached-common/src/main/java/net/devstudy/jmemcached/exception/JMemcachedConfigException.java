package net.devstudy.jmemcached.exception;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public class JMemcachedConfigException extends JMemcachedException {
    public JMemcachedConfigException(String message) {
        super(message);
    }

    public JMemcachedConfigException(String message, Throwable cause) {
        super(message, cause);
    }
}
