package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: z05  reason: default package */
public final class z05 implements y05 {
    public File a;
    public FileInputStream b;
    public FileChannel c;

    public final int c(long j, ByteBuffer byteBuffer) {
        return this.c.read(byteBuffer, j);
    }

    public final void close() {
        this.b.close();
    }

    public final boolean isOpen() {
        return this.c.isOpen();
    }

    public final int read(ByteBuffer byteBuffer) {
        return this.c.read(byteBuffer);
    }

    public final int write(ByteBuffer byteBuffer) {
        return this.c.write(byteBuffer);
    }
}
