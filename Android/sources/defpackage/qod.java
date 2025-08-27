package defpackage;

/* renamed from: qod  reason: default package */
public final class qod {
    public final long a;
    public final long b;

    public qod(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qod.class != obj.getClass()) {
            return false;
        }
        qod qod = (qod) obj;
        return this.a == qod.a && this.b == qod.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
