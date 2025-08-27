package defpackage;

/* renamed from: v62  reason: default package */
public final class v62 {
    public final long a;
    public final int b;
    public final long c;
    public final String d;

    public v62(u62 u62) {
        this.a = u62.b;
        this.b = u62.a;
        this.c = u62.c;
        this.d = (String) u62.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminParticipant{id=");
        sb.append(this.a);
        sb.append(", permissions=");
        sb.append(this.b);
        sb.append(", inviterId=");
        sb.append(this.c);
        sb.append(", alias='");
        return wj6.n(sb, this.d, "'}");
    }
}
