package defpackage;

import java.util.UUID;

/* renamed from: re6  reason: default package */
public final class re6 implements g44 {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        boolean z;
        if ("Amazon".equals(v0g.c)) {
            String str = v0g.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                c = z;
            }
        }
        z = false;
        c = z;
    }

    public re6(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
