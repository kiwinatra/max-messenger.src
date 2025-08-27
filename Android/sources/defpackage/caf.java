package defpackage;

/* renamed from: caf  reason: default package */
public final class caf {
    public final long a;
    public final long b;
    public final long c;

    public caf(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawContact{tamtamContactId=");
        sb.append(this.a);
        sb.append(", rawContactId=");
        sb.append(this.b);
        sb.append(", contactId=");
        return i2a.j(sb, this.c, '}');
    }
}
