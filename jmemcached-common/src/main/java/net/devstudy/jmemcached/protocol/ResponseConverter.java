package net.devstudy.jmemcached.protocol;

import net.devstudy.jmemcached.protocol.model.Response;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by devstudy on 1/18/2017.
 */
public interface ResponseConverter {

    Response readResponse(InputStream inputStream) throws IOException;

    void writeResponse(OutputStream outputStream, Response response) throws IOException;
}
