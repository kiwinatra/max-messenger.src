package org.msgpack.core.buffer;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.io.ConstantsKt;

public class OutputStreamBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private OutputStream out;

    public OutputStreamBufferOutput(OutputStream outputStream) {
        this(outputStream, ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    public void add(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    public void close() throws IOException {
        this.out.close();
    }

    public void flush() throws IOException {
        this.out.flush();
    }

    public MessageBuffer next(int i) throws IOException {
        if (this.buffer.size() < i) {
            this.buffer = MessageBuffer.allocate(i);
        }
        return this.buffer;
    }

    public OutputStream reset(OutputStream outputStream) throws IOException {
        OutputStream outputStream2 = this.out;
        this.out = outputStream;
        return outputStream2;
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
    }

    public void writeBuffer(int i) throws IOException {
        write(this.buffer.array(), this.buffer.arrayOffset(), i);
    }

    public OutputStreamBufferOutput(OutputStream outputStream, int i) {
        ct.f(outputStream, "output is null");
        this.out = outputStream;
        this.buffer = MessageBuffer.allocate(i);
    }
}
