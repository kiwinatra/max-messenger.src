package defpackage;

/* renamed from: uc9  reason: default package */
public final class uc9 {
    public static final uc9 h = new uc9(0, 0, s58.x, 0, false, "", 0);
    public final long a;
    public final long b;
    public final s58 c;
    public final long d;
    public final boolean e;
    public final String f;
    public final long g;

    public uc9(long j, long j2, s58 s58, long j3, boolean z, String str, long j4) {
        this.a = j;
        this.b = j2;
        this.c = s58;
        this.d = j3;
        this.e = z;
        this.f = str;
        this.g = j4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageLocation{messageId=");
        sb.append(this.a);
        sb.append(", contactId=");
        sb.append(this.b);
        sb.append(", location=");
        sb.append(this.c);
        sb.append(", time=");
        sb.append(iq.U(Long.valueOf(this.d)));
        sb.append(", active=");
        sb.append(this.e);
        sb.append(", deviceId='");
        sb.append(this.f);
        sb.append("', livePeriod=");
        return i2a.j(sb, this.g, '}');
    }
}
