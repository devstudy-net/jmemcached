package net.devstudy.jmemcached.protocol;

import net.devstudy.jmemcached.protocol.model.Request;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public interface RequestConverter {

    Request readRequest(InputStream inputStream) throws IOException;

    void writeRequest(OutputStream outputStream, Request request) throws IOException;
}
