package defpackage;

import java.io.Serializable;
import kotlin.UByte;

/* renamed from: vyg  reason: default package */
public final class vyg extends wyg implements Serializable {
    public final byte[] b;

    public vyg(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public final int a() {
        byte[] bArr = this.b;
        int length = bArr.length;
        if (length >= 4) {
            byte b2 = bArr[0] & UByte.MAX_VALUE;
            byte b3 = bArr[1] & UByte.MAX_VALUE;
            byte b4 = bArr[2] & UByte.MAX_VALUE;
            return ((bArr[3] & UByte.MAX_VALUE) << 24) | b2 | (b3 << 8) | (b4 << 16);
        }
        throw new IllegalStateException(b0h.R("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
    }
}
