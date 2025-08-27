package defpackage;

import kotlin.collections.CollectionsKt;

/* renamed from: ked  reason: default package */
public final class ked {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;

    public ked(long j, String str, b89 b89, String str2) {
        long j2 = b89.a;
        this.a = b89.x;
        cl4 cl4 = b89.B0;
        this.b = cl4 != null ? cl4.a : System.currentTimeMillis();
        this.c = b89.v == re9.v;
        Object firstOrNull = CollectionsKt.firstOrNull(b89.y);
        String str3 = null;
        web web = firstOrNull instanceof web ? (web) firstOrNull : null;
        if (web != null) {
            String str4 = web.v0;
            str3 = str4 == null ? web.o : str4;
        }
        this.d = str3;
    }
}
