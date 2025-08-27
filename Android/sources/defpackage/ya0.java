package defpackage;

/* renamed from: ya0  reason: default package */
public final class ya0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ya0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ya0)) {
            return false;
        }
        ya0 ya0 = (ya0) obj;
        return this.a.equals(ya0.a) && this.b.equals(ya0.b) && this.c.equals(ya0.c) && this.d.equals(ya0.d);
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return wj6.n(sb, this.d, "}");
    }
}
