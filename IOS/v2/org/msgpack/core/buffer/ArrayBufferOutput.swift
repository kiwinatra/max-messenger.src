package org.msgpack.core.buffer;

import java.util.ArrayList;
import java.util.List;
import kotlin.io.ConstantsKt;

public class ArrayBufferOutput implements MessageBufferOutput {
    private final int bufferSize;
    private MessageBuffer lastBuffer;
    private final List<MessageBuffer> list;

    public ArrayBufferOutput() {
        this(ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    public void add(byte[] bArr, int i, int i2) {
        this.list.add(MessageBuffer.wrap(bArr, i, i2));
    }

    public void clear() {
        this.list.clear();
    }

    public void close() {
    }

    public void flush() {
    }

    public int getSize() {
        int i = 0;
        for (MessageBuffer size : this.list) {
            i += size.size();
        }
        return i;
    }

    public MessageBuffer next(int i) {
        MessageBuffer messageBuffer = this.lastBuffer;
        if (messageBuffer != null && messageBuffer.size() > i) {
            return this.lastBuffer;
        }
        MessageBuffer allocate = MessageBuffer.allocate(Math.max(this.bufferSize, i));
        this.lastBuffer = allocate;
        return allocate;
    }

    public List<MessageBuffer> toBufferList() {
        return new ArrayList(this.list);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[getSize()];
        int i = 0;
        for (MessageBuffer next : this.list) {
            next.getBytes(0, bArr, i, next.size());
            i += next.size();
        }
        return bArr;
    }

    public MessageBuffer toMessageBuffer() {
        return this.list.size() == 1 ? this.list.get(0) : this.list.isEmpty() ? MessageBuffer.allocate(0) : MessageBuffer.wrap(toByteArray());
    }

    public void write(byte[] bArr, int i, int i2) {
        MessageBuffer allocate = MessageBuffer.allocate(i2);
        allocate.putBytes(0, bArr, i, i2);
        this.list.add(allocate);
    }

    public void writeBuffer(int i) {
        this.list.add(this.lastBuffer.slice(0, i));
        if (this.lastBuffer.size() - i > this.bufferSize / 4) {
            MessageBuffer messageBuffer = this.lastBuffer;
            this.lastBuffer = messageBuffer.slice(i, messageBuffer.size() - i);
            return;
        }
        this.lastBuffer = null;
    }

    public ArrayBufferOutput(int i) {
        this.bufferSize = i;
        this.list = new ArrayList();
    }
}
