package net.devstudy.jmemcached.protocol.model;

/**
 * Created by devstudy on 1/18/2017.
 */
public class Response extends AbstractPackage {
    private final Status status;

    public Response(Status status, byte[] data) {
        super(data);
        this.status = status;
    }

    public Response(Status status) {
        this.status = status;
    }
}
