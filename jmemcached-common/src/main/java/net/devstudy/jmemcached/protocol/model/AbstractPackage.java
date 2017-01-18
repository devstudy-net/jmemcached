package net.devstudy.jmemcached.protocol.model;

/**
 * Created by devstudy on 1/18/2017.
 */
abstract class AbstractPackage {
    private byte[] data;

    AbstractPackage(byte[] data) {
        this.data = data;
    }

    AbstractPackage() {
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public boolean hasData(){
        return data != null && data.length > 0;
    }
}
