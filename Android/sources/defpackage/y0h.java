package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: y0h  reason: default package */
public abstract class y0h {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
