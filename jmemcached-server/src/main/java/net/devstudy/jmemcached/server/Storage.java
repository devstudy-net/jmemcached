package net.devstudy.jmemcached.server;

import net.devstudy.jmemcached.protocol.model.Status;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public interface Storage extends AutoCloseable {

    Status put(String key, Long ttl, byte[] data);

    byte[] get(String key);

    Status remove(String key);

    Status clear();
}
