package defpackage;

/* renamed from: yd8  reason: default package */
public final class yd8 {
    public final long a;
    public final tf8 b;
    public final boolean c;

    public yd8(long j, tf8 tf8, boolean z) {
        this.a = j;
        this.b = tf8;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yd8.class != obj.getClass()) {
            return false;
        }
        yd8 yd8 = (yd8) obj;
        if (this.a == yd8.a && this.c == yd8.c) {
            return this.b == yd8.b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31) + (this.c ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key{contactId=");
        sb.append(this.a);
        sb.append(", markerWeight=");
        sb.append(this.b);
        sb.append(", active=");
        return wzf.l(sb, this.c, '}');
    }
}
