package defpackage;

/* renamed from: g98  reason: default package */
public final class g98 {
    public static final n77 g = new n77(27);
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoginResponse{uid='");
        sb.append(this.a);
        sb.append("', sessionKey='");
        sb.append(this.b);
        sb.append("', secretSessionKey='");
        sb.append(this.c);
        sb.append("', authenticationToken='");
        sb.append(this.d);
        sb.append("', apiServer='");
        sb.append(this.e);
        sb.append("', authenticationHash='");
        return wj6.n(sb, this.f, "'}");
    }
}
