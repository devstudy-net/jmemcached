package net.devstudy.jmemcached.server;

import net.devstudy.jmemcached.protocol.RequestConverter;
import net.devstudy.jmemcached.protocol.ResponseConverter;

import java.net.Socket;
import java.util.concurrent.ThreadFactory;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public interface ServerConfig extends AutoCloseable {

    RequestConverter getRequestConverter();

    ResponseConverter getResponseConverter();

    Storage getStorage();

    CommandHandler getCommandHandler();

    ThreadFactory getWorkerThreadFactor();

    int getClearDataIntervalInMs();

    int getServerPort();

    int getInitThreadCount();

    int getMaxThreadCount();

    ClientSocketHandler buildNewClientSocketHandler(Socket clientSocket);
}
