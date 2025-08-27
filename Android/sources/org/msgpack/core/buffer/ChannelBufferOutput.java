package org.msgpack.core.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.io.ConstantsKt;

public class ChannelBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private WritableByteChannel channel;

    public ChannelBufferOutput(WritableByteChannel writableByteChannel) {
        this(writableByteChannel, ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    public void add(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    public void close() throws IOException {
        this.channel.close();
    }

    public void flush() throws IOException {
    }

    public MessageBuffer next(int i) throws IOException {
        if (this.buffer.size() < i) {
            this.buffer = MessageBuffer.allocate(i);
        }
        return this.buffer;
    }

    public WritableByteChannel reset(WritableByteChannel writableByteChannel) throws IOException {
        WritableByteChannel writableByteChannel2 = this.channel;
        this.channel = writableByteChannel;
        return writableByteChannel2;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            this.channel.write(wrap);
        }
    }

    public void writeBuffer(int i) throws IOException {
        ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer(0, i);
        while (sliceAsByteBuffer.hasRemaining()) {
            this.channel.write(sliceAsByteBuffer);
        }
    }

    public ChannelBufferOutput(WritableByteChannel writableByteChannel, int i) {
        ct.f(writableByteChannel, "output channel is null");
        this.channel = writableByteChannel;
        this.buffer = MessageBuffer.allocate(i);
    }
}
