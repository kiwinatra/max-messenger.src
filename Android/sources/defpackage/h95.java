package defpackage;

/* renamed from: h95  reason: default package */
public final class h95 {
    public final b95[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public h95(String str, String str2, long[] jArr, b95[] b95Arr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = b95Arr;
    }

    public final String a() {
        String str = this.c;
        int f = g63.f(1, str);
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(g63.f(f, str2));
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
