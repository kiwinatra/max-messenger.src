package defpackage;

import java.util.UUID;

/* renamed from: qe6  reason: default package */
public final class qe6 implements f44 {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    static {
        boolean z;
        if ("Amazon".equals(t0g.c)) {
            String str = t0g.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                d = z;
            }
        }
        z = false;
        d = z;
    }

    public qe6(UUID uuid, byte[] bArr, boolean z) {
        this.a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
