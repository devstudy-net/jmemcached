package net.devstudy.jmemcached.protocol;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public interface ObjectSerializer {

    byte[] toByteArray(Object object);

    Object fromByteArray(byte[] array);
}
