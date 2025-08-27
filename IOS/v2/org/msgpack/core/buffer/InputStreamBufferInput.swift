package org.msgpack.core.buffer;

import java.io.IOException;
import java.io.InputStream;
import kotlin.io.ConstantsKt;

public class InputStreamBufferInput implements MessageBufferInput {
    private final byte[] buffer;
    private InputStream in;

    public InputStreamBufferInput(InputStream inputStream) {
        this(inputStream, ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = ((java.io.FileInputStream) r1).getChannel();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.msgpack.core.buffer.MessageBufferInput newBufferInput(java.io.InputStream r1) {
        /*
            java.lang.String r0 = "InputStream is null"
            defpackage.ct.f(r1, r0)
            boolean r0 = r1 instanceof java.io.FileInputStream
            if (r0 == 0) goto L_0x0018
            r0 = r1
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0
            java.nio.channels.FileChannel r0 = r0.getChannel()
            if (r0 == 0) goto L_0x0018
            org.msgpack.core.buffer.ChannelBufferInput r1 = new org.msgpack.core.buffer.ChannelBufferInput
            r1.<init>(r0)
            return r1
        L_0x0018:
            org.msgpack.core.buffer.InputStreamBufferInput r0 = new org.msgpack.core.buffer.InputStreamBufferInput
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.InputStreamBufferInput.newBufferInput(java.io.InputStream):org.msgpack.core.buffer.MessageBufferInput");
    }

    public void close() throws IOException {
        this.in.close();
    }

    public MessageBuffer next() throws IOException {
        int read = this.in.read(this.buffer);
        if (read == -1) {
            return null;
        }
        return MessageBuffer.wrap(this.buffer, 0, read);
    }

    public InputStream reset(InputStream inputStream) throws IOException {
        InputStream inputStream2 = this.in;
        this.in = inputStream;
        return inputStream2;
    }

    public InputStreamBufferInput(InputStream inputStream, int i) {
        ct.f(inputStream, "input is null");
        this.in = inputStream;
        this.buffer = new byte[i];
    }
}
