package defpackage;

/* renamed from: hj0  reason: default package */
public class hj0 extends ij0 {
    public final qaf b;

    public hj0(qaf qaf) {
        this(Long.MIN_VALUE, qaf);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseErrorEvent{error=");
        sb.append(this.b);
        sb.append(", requestId=");
        return i2a.j(sb, this.a, '}');
    }

    public hj0(long j, qaf qaf) {
        super(j);
        this.b = qaf;
    }
}
