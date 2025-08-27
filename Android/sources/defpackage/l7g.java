package defpackage;

import java.util.Map;

/* renamed from: l7g  reason: default package */
public final class l7g extends ij0 {
    public final Map b;
    public final long c;
    public final long o;
    public final String v;

    public l7g(long j, long j2, long j3, String str, Map map) {
        super(j);
        this.b = map;
        this.c = j2;
        this.o = j3;
        this.v = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPlayEvent{urls=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.o);
        sb.append(", attachLocalId='");
        return wj6.n(sb, this.v, "'}");
    }
}
