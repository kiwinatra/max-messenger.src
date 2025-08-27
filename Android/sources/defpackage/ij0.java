package defpackage;

import java.io.Serializable;

/* renamed from: ij0  reason: default package */
public abstract class ij0 implements Serializable {
    public final long a;

    public ij0() {
        this(Long.MIN_VALUE);
    }

    public String toString() {
        return i2a.j(new StringBuilder("BaseEvent{requestId="), this.a, '}');
    }

    public ij0(long j) {
        this.a = j;
    }
}
