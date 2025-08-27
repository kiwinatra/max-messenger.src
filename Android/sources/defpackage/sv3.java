package defpackage;

/* renamed from: sv3  reason: default package */
public final class sv3 {
    public final /* synthetic */ int a = 0;
    public long b;
    public String c;
    public String d;
    public String e;

    public /* synthetic */ sv3() {
    }

    public boolean a() {
        sq9.b.getClass();
        return o9a.l(this.d);
    }

    public boolean b() {
        sq9.b.getClass();
        return o9a.m(this.d);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentUriParams{contentLength=");
                sb.append(this.b);
                sb.append(", contentName='");
                sb.append(this.c);
                sb.append("', mimeType='");
                sb.append(this.d);
                sb.append("', path='");
                return wj6.n(sb, this.e, "'}");
            default:
                return super.toString();
        }
    }

    public sv3(sv3 sv3) {
        this.b = sv3.b;
        this.c = sv3.c;
        this.d = sv3.d;
        this.e = sv3.e;
    }
}
