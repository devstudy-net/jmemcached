package net.devstudy.jmemcached.server.impl;

import java.util.Properties;

import net.devstudy.jmemcached.server.Storage;

import static org.mockito.Mockito.mock;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public abstract class AbstractDefaultServerConfigTest {

    protected Storage storage;

    protected DefaultServerConfig createDefaultServerConfigMock(Properties overrideApplicationProperties) {
        storage = mock(Storage.class);
        return new DefaultServerConfig(overrideApplicationProperties) {
            @Override
            protected Storage createStorage() {
                return storage;
            }
        };
    }
}
