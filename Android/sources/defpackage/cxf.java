package defpackage;

/* renamed from: cxf  reason: default package */
public final class cxf {
    public final long a;
    public final long b;
    public long c;

    public /* synthetic */ cxf(long j, long j2) {
        this(j, j2, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxf)) {
            return false;
        }
        cxf cxf = (cxf) obj;
        return this.a == cxf.a && this.b == cxf.b && this.c == cxf.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.a;
        StringBuilder n = tr1.n(j2, "Chunk[", " -> ");
        n.append(j + j2);
        n.append(" (position: ");
        n.append(this.c + j2);
        n.append(")]");
        return n.toString();
    }

    public cxf(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
