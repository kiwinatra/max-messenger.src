package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: xu0  reason: default package */
public interface xu0 extends yfe, ReadableByteChannel {
    boolean C();

    String H(long j);

    long L(zx zxVar);

    String P(Charset charset);

    void R(rt0 rt0, long j);

    void S(long j);

    String Y();

    vw0 f(long j);

    int f0(b5b b5b);

    rt0 getBuffer();

    void i0(long j);

    long l0();

    InputStream o0();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();
}
