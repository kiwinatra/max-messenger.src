package defpackage;

/* renamed from: dqc  reason: default package */
public final class dqc extends eqc {
    public final long a;
    public final long b;
    public final float c;

    public dqc(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqc)) {
            return false;
        }
        dqc dqc = (dqc) obj;
        return this.a == dqc.a && this.b == dqc.b && Float.compare(this.c, dqc.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Uploading(messageId=" + this.a + ", totalBytes=" + this.b + ", progress=" + this.c + ")";
    }
}
