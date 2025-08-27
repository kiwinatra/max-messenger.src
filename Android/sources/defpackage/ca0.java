package defpackage;

/* renamed from: ca0  reason: default package */
public final class ca0 {
    public final int a;
    public final long b;

    public ca0(int i, long j) {
        if (i != 0) {
            this.a = i;
            this.b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ca0)) {
            return false;
        }
        ca0 ca0 = (ca0) obj;
        return tr1.c(this.a, ca0.a) && this.b == ca0.b;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((tr1.y(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return wj6.m(sb, this.b, "}");
    }
}
