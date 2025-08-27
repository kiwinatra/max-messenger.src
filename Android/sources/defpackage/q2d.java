package defpackage;

import java.util.Objects;

/* renamed from: q2d  reason: default package */
public final class q2d implements n9d {
    public final long a;
    public final long b;

    public q2d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q2d.class != obj.getClass()) {
            return false;
        }
        q2d q2d = (q2d) obj;
        return this.a == q2d.a && this.b == q2d.b;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportPerfStatCommand{framesReceived=");
        sb.append(this.a);
        sb.append(", framesDecoded=");
        return i2a.j(sb, this.b, '}');
    }
}
