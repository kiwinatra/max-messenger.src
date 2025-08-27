package defpackage;

import java.nio.ByteBuffer;

/* renamed from: nv3  reason: default package */
public interface nv3 {
    static long a(nv3 nv3) {
        byte[] bArr = (byte[]) ((od4) nv3).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1;
    }
}
