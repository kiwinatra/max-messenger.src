package defpackage;

/* renamed from: q9e  reason: default package */
public abstract class q9e {
    public final boolean direct;
    public final String message;

    public q9e(String str, boolean z) {
        this.message = str;
        this.direct = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q9e q9e = (q9e) obj;
        if (this.direct != q9e.direct) {
            return false;
        }
        return this.message.equals(q9e.message);
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + (this.direct ? 1 : 0);
    }
}
