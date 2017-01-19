package net.devstudy.jmemcached.server;

import net.devstudy.jmemcached.protocol.model.Request;
import net.devstudy.jmemcached.protocol.model.Response;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public interface CommandHandler {

    Response handle(Request request);
}
