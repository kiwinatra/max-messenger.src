package org.msgpack.core.buffer;

import java.nio.ByteBuffer;

public class ByteBufferInput implements MessageBufferInput {
    private ByteBuffer input;
    private boolean isRead = false;

    public ByteBufferInput(ByteBuffer byteBuffer) {
        ct.f(byteBuffer, "input ByteBuffer is null");
        this.input = byteBuffer.slice();
    }

    public void close() {
    }

    public MessageBuffer next() {
        if (this.isRead) {
            return null;
        }
        MessageBuffer wrap = MessageBuffer.wrap(this.input);
        this.isRead = true;
        return wrap;
    }

    public ByteBuffer reset(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.input;
        ct.f(byteBuffer, "input ByteBuffer is null");
        this.input = byteBuffer.slice();
        this.isRead = false;
        return byteBuffer2;
    }
}
