package defpackage;

import java.util.Arrays;

/* renamed from: j60  reason: default package */
public final class j60 {
    public static final j60 e = new j60(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public j60(ea6 ea6) {
        this(ea6.C, ea6.B, ea6.D);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j60)) {
            return false;
        }
        j60 j60 = (j60) obj;
        return this.a == j60.a && this.b == j60.b && this.c == j60.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return tr1.k(sb, this.c, ']');
    }

    public j60(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = v0g.L(i3) ? v0g.D(i3, i2) : -1;
    }
}
