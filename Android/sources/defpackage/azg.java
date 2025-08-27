package defpackage;

import java.io.IOException;

/* renamed from: azg  reason: default package */
public abstract class azg {
    protected int zza;

    public abstract int a(l2h l2h);

    public final byte[] b() {
        try {
            int c = c();
            byte[] bArr = new byte[c];
            wzg wzg = new wzg(c, bArr);
            p0h p0h = (p0h) this;
            l2h a = h2h.c.a(p0h.getClass());
            p1e p1e = wzg.m;
            if (p1e == null) {
                p1e = new p1e(wzg);
            }
            a.c(p0h, p1e);
            if (c - wzg.p == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(wj6.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    public abstract int c();
}
