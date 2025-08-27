package defpackage;

/* renamed from: umd  reason: default package */
public final class umd implements wmd {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final String o;
    public final String v;
    public final boolean w;
    public final jnd x = null;
    public final long y;
    public final int z;

    public umd(long j, String str, String str2, String str3, String str4, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.v = str4;
        this.w = z2;
        this.y = j >= 0 ? -j : j;
        this.z = m1b.r;
    }

    public final jnd g() {
        return this.x;
    }

    public final long getItemId() {
        return this.y;
    }

    public final int i() {
        return this.z;
    }
}
