package net.devstudy.jmemcached.client.impl;

import net.devstudy.jmemcached.client.Client;

import java.io.IOException;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public class JMemcachedClientFactory {

    public static Client buildNewClient(String host, int port) throws IOException {
        return null;
    }

    public static Client buildNewClient(String host) throws IOException {
        return buildNewClient(host, 9010);
    }

    public static Client buildNewClient() throws IOException {
        return buildNewClient("localhost");
    }
}
