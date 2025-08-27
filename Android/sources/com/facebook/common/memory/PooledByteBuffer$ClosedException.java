package com.facebook.common.memory;

public class PooledByteBuffer$ClosedException extends RuntimeException {
    public PooledByteBuffer$ClosedException() {
        super("Invalid bytebuf. Already closed");
    }
}
