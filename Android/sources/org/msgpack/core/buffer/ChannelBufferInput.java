package org.msgpack.core.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.io.ConstantsKt;

public class ChannelBufferInput implements MessageBufferInput {
    private final MessageBuffer buffer;
    private ReadableByteChannel channel;

    public ChannelBufferInput(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    public void close() throws IOException {
        this.channel.close();
    }

    public MessageBuffer next() throws IOException {
        ByteBuffer sliceAsByteBuffer = this.buffer.sliceAsByteBuffer();
        if (this.channel.read(sliceAsByteBuffer) == -1) {
            return null;
        }
        sliceAsByteBuffer.flip();
        return this.buffer.slice(0, sliceAsByteBuffer.limit());
    }

    public ReadableByteChannel reset(ReadableByteChannel readableByteChannel) throws IOException {
        ReadableByteChannel readableByteChannel2 = this.channel;
        this.channel = readableByteChannel;
        return readableByteChannel2;
    }

    public ChannelBufferInput(ReadableByteChannel readableByteChannel, int i) {
        ct.f(readableByteChannel, "input channel is null");
        this.channel = readableByteChannel;
        boolean z = i > 0;
        String h = wj6.h(i, "buffer size must be > 0: ");
        if (z) {
            this.buffer = MessageBuffer.allocate(i);
            return;
        }
        throw new IllegalArgumentException(String.valueOf(h));
    }
}
