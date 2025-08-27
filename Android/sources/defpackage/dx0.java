package defpackage;

/* renamed from: dx0  reason: default package */
public final class dx0 {
    public final String a;
    public final zx0 b;
    public final String c;
    public final boolean d;

    public dx0(String str, zx0 zx0, String str2, boolean z) {
        this.a = str;
        this.b = zx0;
        this.c = str2;
        this.d = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheClearItem{text='");
        sb.append(this.a);
        sb.append("', cacheType=");
        sb.append(this.b);
        sb.append(", bytesText='");
        sb.append(this.c);
        sb.append("', checked=");
        return wzf.l(sb, this.d, '}');
    }
}
