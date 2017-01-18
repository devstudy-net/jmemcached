package net.devstudy.jmemcached.protocol.impl;

import net.devstudy.jmemcached.protocol.model.Response;
import net.devstudy.jmemcached.protocol.model.Status;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @author devstudy
 * @see http://devstudy.net
 */
public class DefaultResponseConverterTest {
    private final DefaultResponseConverter defaultResponseConverter = new DefaultResponseConverter();

    private final byte[] responseWithoutData = new byte[]
            // version, status, flags
              {16,      0,      0};

    private final byte[] responseWithData = new byte[]
            // version, status, flags,  int length,  byte array
              {16,      0,      1,      0, 0, 0, 3,  1, 2, 3};

    @Test
    public void readResponseWithoutData() throws IOException {
        Response response = defaultResponseConverter.readResponse(new ByteArrayInputStream(responseWithoutData));
        assertEquals(Status.ADDED, response.getStatus());
        assertFalse(response.hasData());
    }

    @Test
    public void readResponseWithData() throws IOException {
        Response response = defaultResponseConverter.readResponse(new ByteArrayInputStream(responseWithData));
        assertEquals(Status.ADDED, response.getStatus());
        assertTrue(response.hasData());
        assertArrayEquals(new byte[]{1, 2, 3}, response.getData());
    }

    @Test
    public void writeResponseWithoutData() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Response response = new Response(Status.ADDED);
        defaultResponseConverter.writeResponse(out, response);
        assertArrayEquals(responseWithoutData, out.toByteArray());
    }

    @Test
    public void writeResponseWithData() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Response response = new Response(Status.ADDED, new byte[]{1, 2, 3});
        defaultResponseConverter.writeResponse(out, response);
        assertArrayEquals(responseWithData, out.toByteArray());
    }
}