package defpackage;

import java.util.Set;

/* renamed from: ee2  reason: default package */
public final class ee2 extends ij0 {
    public final long b;
    public final int c;
    public final int o;
    public final int v;
    public final Set w;

    public ee2(long j, long j2, int i, int i2, int i3, Set set) {
        super(j);
        this.b = j2;
        this.c = i;
        this.o = i2;
        this.v = i3;
        this.w = set;
    }

    public final String toString() {
        return "ChatMediaEvent{messageId=" + this.b + ", forwardCount=" + this.c + ", backwardCount=" + this.o + ", responseCount=" + this.v + ", types=" + this.w + "} " + super.toString();
    }
}
