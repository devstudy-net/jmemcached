package net.devstudy.jmemcached.protocol;

/**
 * Created by devstudy on 1/18/2017.
 */
public interface ObjectSerializer {

    byte[] toByteArray(Object object);

    Object fromByteArray(byte[] array);
}
