package defpackage;

import java.nio.ByteBuffer;

/* renamed from: mv3  reason: default package */
public interface mv3 {
    static long a(mv3 mv3) {
        byte[] bArr = (byte[]) ((nd4) mv3).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1;
    }
}
