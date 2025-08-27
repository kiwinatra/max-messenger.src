package defpackage;

/* renamed from: i60  reason: default package */
public final class i60 {
    public static final i60 e = new i60(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public i60(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = t0g.B(i3) ? t0g.v(i3, i2) : -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
